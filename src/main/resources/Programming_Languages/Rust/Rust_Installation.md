# Rust Installation:

### Installing Rust:
* Install using `rustup``:
```
curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh
```
* Add the following to your `.zshrc` file:
```
export PATH="$HOME/.cargo/bin:$PATH"
```
* Install a C Compiler:
```
xcode-select --install
```
* To check whether you have Rust installed:
```
rustc --version
```
* To update Rust:
```
rustup update
```