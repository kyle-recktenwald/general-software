# Design & Analysis of Algorithms - Preface Notes:

### Introduction:
* The most valuable acquisitions in a scientific or technical education are the general-purpose mental tools which 
  remain serviceable for a life-time
  * -George Forsythe
* Algorithms play the central role in both science and practice of computing
  * Recognition of this fact has led to the appearance of a considerable number of textbooks on the subject
* By and large, they follow one of two alternatives in presenting algorithms
  * One classifies algorithms according to a problem type
    * Such a book would have separate chapters on algorithms for sorting, searching, graphs, and so on
    * The advantage of this approach is that it allows an immediate comparison of, say, the efficiency of different 
      algorithms for the same problem
    * The drawback to this approach is that it emphasizes problem types at the expense of algorithm design techniques
  * The second alternative organizes the presentation around algorithm design techniques
    * In this organization, algorithms from different areas of computing are grouped together if they have the same
      design approach
    * I share the belief of many that this organization is more appropriate for a basic course on the design and 
      analysis of algorithms
  * There are three principal reasons for emphasis on algorithm design techniques:
    * First, these techniques provide a student with tools for designing algorithms for new problems
      * This makes learning algorithm design techniques a very valuable endeavor from a practical standpoint
    * Second, they seek to classify multitudes of known algorithms according to an underlying design idea
      * Learning to see such commonality among algorithms from different application areas should be a major goal of
        computer science education
      * After all, every science considers classification of its principal subject as a major if not the central point
        of its  discipline
    * Third, in my opinion, algorithm design techniques have utility as general problem solving strategies, applicable
      to problems beyond computing
  * Unfortunately, the traditional classification of algorithm design techniques has several serious shortcomings, from 
    both theoretical and edicational points of view
  * The most significant of these shortcomings is the failure to classify many importannt algorithms
  * This limitation has forced the authors of other textbooks to depart from the design technique organization and to
    include chapters dealing with specific problem types
  * Such a switch leads to a loss of course coherence and almost unavoidable creates a confusion in students' minds

### New Taxonomy of Algorithm Design Techniques:
* My frustration with the shortcomings of the traditional classification of algorithm design techniques has motivated
  me to develop a new taxonomy of them, which is the basis of this book
* Here are the principal advantages of the new taxonomy:
  * It is more comprehensive than the traditional one
    * It includes several strategies including brute force, decreases-and-conquer, transform-and-conquer, space and
     time trade-offs, and iterative improvement, that are rarely if ever recognized as important design paradigms
  * The new taxonomy covers naturally many classic algorithms (Euclid's algorithm, heapsort, search trees, hashing, 
    topological sorting, Gaussian elimination, Horner's rule to name a few) that the traditional taxonomy cannot classify
    * As a result, the new taxonomy makes it possible to present the standard body of classic algorithms in a unified
      and coherent fashion
  * It naturally accomodates the existence of important varieties of sseveral design techniques
    * For example, it recognizes three variations of decrease-and-conquer and three variations of transform-and-conquer
  * It is better aligned with analytical methods for the efficiency analysis (See Appendix B)

### Design Techniques as General Problem Solving Strategies:
* Most applications of the design techniques in the book are to classic problems of computer science
  * The only innovation here is an inclusion of some materials on numerical algorithms, which are covered within the 
    same general framework
  * But these design techniques can be considered general problem-solving tools, whose applications are not limited to
    traditional computing and mathematical problems
  * Two factors make this point particularly important:
    * First, more and more computing applications go beyond the traditional domain, and there are reasons to believe
      that this trend will strengthen the future
    * Second, developing students' problem-solving skills has come to be recognized as a major goal of college education
    * Among all the courses in a computer science curriculum, a course on the design and analysis of algorithms is
      uniquely suitable for this task because it can offer a student specific strategies for solving problems
  * I am not proposing that a course on the design and analysis of algorithms should become a course on general problem solving
  * But I do believe that thhe unique opportunity procided by studying the design and analysis of algorithms should not be missed
  * Toward thihs goal, thhe book includes applications to puzzles and puzzle-like games
  * Although using puzzles in teaching algorithms is certainly not a new idea, the book tries to do this systematically
    by going well beyond a few standard examples

### Textbook Pedagogy:
* My goal was to write a text that would not trivialize the subject, but would still be readable by most students on their own
* Here are some of the things done toward this objective:
  * Sharing the opinion of George Forsythe expressed above, I have sought to stress major ideas underlying the design
    and analysis of algorithms
    * In choosing specific algorithms to illustrate these ideas, I limited the number of covered algorithms to those
      that demonstrate an underlying design technique or an analysis method most clearly
    * Fortunately, most classic algorithms satisfy this criterion
  * In chapter 2, which is dedvoted to efficiency analysis, the methods used for analyzing nonrecursive algorithms 
    are separated from those typically used for analyzing recursive algorithms
    * The chapter also includes sections devoted to empiracal analysis of algorithm visualization
  * The narrative is systematically interrupted by questions to the reader
    * Some of them are asked rhetorically, in anticipation of a concern or doubt, and are answered immediately
    * The goal of the others is to prevent the reader from drifiting through the text without a satisfactory level of
      comprehension
  * Each chapter ends with a summary recapping the most important concepts and results discussed in the chapter
  * The book contains over 600 exercises
    * Some of them are drills;
    * Other make important points about the material convered in the body of the text or introduce algorithms not
      covered there at all
    * A few exercises take advantage of internet resources
    * More difficult problems, there are not many of them, are marked by special symbols in the Instructor's manual
      * Because marking problems as difficult may discourage some students from trying to tackle them, problems are
       not marked in the book itself
    * Puzzles, games, and puzzle like questions are marked in the exercise with a special icon
  * This book provides hints to all the exercises
    * Detailed solutions, eexcept for the programming projects, are provided in the Instructor's manual,, availablee to 
      qualified adopters through Pearson's Instructor Resource Center
    * Please contact your local Pearson sales representative or go to www.personhighered.com/irc to access this material
    * Slides in PowerPoint are available to all readers of this book via anonymous ftp at the CS Support site:
      http://cssupport.pearsoncmg.com

### Prerequisites:
* The book assumess that a reader has gone through an introductory programming course and a standard course on discrete
  structures
* With such a background, he or she should be able to handle the book's material without undue difficulty
* Still, fundamental data structures, necessary summation formulas, and recurrence relations are reviewed in Section 
  1.4, Appendix A and Appendix B, respectively
* Calculus iss used in only three sections (Section 2.2, 11.4, and 12.4), and to a very limited degree;
  * If studentws lack calculus as an assured part of their background, the relevevant portions of these three sections 
    can be omitted without hindering their understanding of the rest of the material

