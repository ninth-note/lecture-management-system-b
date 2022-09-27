# lecture-management-system (part b)
Assignment with a goal of reinforcing the understanding of modern software development frameworks

# Assignment outline
After completing (part a): https://github.com/ninth-note/lecture-management-system-a#readme

  Start on the second part of the assignment:
  
  b) [7 marks]
  
    A second Gradle project adds the project release in part a) as a dependency using Jitpack,
    i.e. pulling it from the GitHub repository on demand and providing you with the artefacts on
    demand (see also Additional Guidelines).
    
    Part b) acts as a driver project, creating a handful of fictional students with mock data,
    adding the students to a number of modules and adding a number of modules to a course.
    Further on, the program should print out a list of all the courses, their respective modules,
    and all students, their usernames, assigned modules and the course(s) they are registered
    for to the console. Again, use Git and Github to setup a local / global repository.
 
 c) [6 marks]
 
  Setup a Jenkins pipeline that checks out the code from the repository, compiles it, does Junit
  testing, and then deploys the war file (see also Additional Guidelines).
