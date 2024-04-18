# Terraform Overview:

### Overview:
* Terraform is an **open-source infrastructure as code** (**IaC**) **tool** created by **HashiCorp**
* It allows users to **define** and **provision infrastructure** using a **declarative configuration language**
* With Terraform, you can **describe the infrastructure components**, such as **servers**, **networks**, and 
  **databases**, in code
* The **configuration files**, often written in **HashiCorp Configuration Language (HCL)**, specify the **desired state 
  of the infrastructure**
* Terraform then **takes these configuration files** and **applies them to create**, **update**, or **delete** the 
  **specified infrastructure resources**
* It **supports various cloud providers**, including **AWS**, **Azure**, **Google Cloud Platform**, and others, as well 
  as **on-premises** and **hybrid cloud environments**
* Terraform helps **automate** the **provisioning** and **management of infrastructure**, making it **easier to scale 
  and maintain complex systems**

### Example HCL File:
```
# Define the provider (in this case, AWS)
provider "aws" {
  region = "us-east-1"
}

# Define a VPC
resource "aws_vpc" "example" {
  cidr_block = "10.0.0.0/16"
}

# Define a security group
resource "aws_security_group" "example" {
  vpc_id = aws_vpc.example.id

  # Define inbound and outbound rules as needed
  # ...

  # Example: Allow inbound traffic on port 80 for the web application
  ingress {
    from_port   = 80
    to_port     = 80
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
}

# Define an EC2 instance for Java Spring backend
resource "aws_instance" "java_spring_instance" {
  ami           = "ami-xxxxxxxx"  # Specify the appropriate AMI ID
  instance_type = "t2.micro"      # Choose an instance type based on your needs
  vpc_security_group_ids = [aws_security_group.example.id]

  # Configure other instance details such as key_name, user_data, etc.
  # ...

  tags = {
    Name = "JavaSpringInstance"
  }
}

# Define an S3 bucket for React frontend
resource "aws_s3_bucket" "react_frontend" {
  bucket = "react-frontend-bucket"
  acl    = "public-read"

  # Configure other S3 bucket settings as needed
  # ...
}

# Define Keycloak resources (e.g., EC2 instance, database, etc.)
# ...

# Additional resources and configurations for the web application
# ...
```

### Installing Terraform:
```
brew install hashicorp/tap/terraform

terraform -v
```

### Creating and Destroying AWS EC2 Within Terraform:
* [Terraform Tutorial on Youtube](https://youtu.be/SLB_c_ayRMo?si=AfiFnvGA32t3xEaW)
* Create a `main.tf` file:
* **Configure the AWS Provider:**
  * [https://registry.terraform.io/providers/hashicorp/aws/latest/docs](AWS Provider Documentation)
```
provider "aws" {
  region = "us-east-1"
  access_key = "..."
  secret_key = "..."
}

resource "aws_instance" "my-first-server" {
  ami           = "ami-080e1f13689e07408"
  instance_type = "t2.micro"
  
  tags = {
    Name = "ubuntu"
  }
}

resource "aws_vpc" "first-vpc" {
  cidr_block       = "10.0.0.0/16"

  tags = {
    Name = "production"
  }
}

resource "aws_subnet" "subnet-1" {
  vpc_id     = aws_vpc.first-vpc.id
  cidr_block = "10.0.1.0/24"

  tags = {
    Name = "prod-subnet"
  }
}
```
* Use the `terraform plan` command to preview changes, validate configuration, and ensure predictable infrastructure 
  modifications before applying
* Use `terraform apply`, and answer `yes` to generate the instance
* Use `terraform destroy` to delete the created instances
* Note that you can also just comment out/remove the resource and run `terraform apply` to delete a specific EC2 
  instance

```
terraform plan
terraform apply
terraform destroy
```

### Terraform State Commands:
```
terraform state list
terraform state show
```

### Terraform Output:
```
# output "server_private_ip" {
#   value = aws_instance.web-server-instance.private_ip

# }

# output "server_id" {
#   value = aws_instance.web-server-instance.id
# }
```

### Terraform Variables:
```
variable "subnet_prefix" {
  description = "cidr block for the subnet"

}
```

* Default Variable filename: `terraform.tfvars`

```
terraform apply -var-file example.tfvars
```