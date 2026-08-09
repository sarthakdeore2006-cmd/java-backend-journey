# 📚 Java Backend Journey — Phase 1 Notes

## Phase 1 — Foundation

**Status:** 🟡 In Progress

---

# 🎯 Objective

Before writing backend applications, I want to understand how software works under the hood.

Instead of jumping directly into Spring Boot, I am building strong foundations first through concepts, hands-on practice, and small projects.

---

# 📖 Topics Covered

- Backend Development
- Client-Server Architecture
- HTTP & HTTPS Basics
- HTTP Methods
- Request-Response Lifecycle
- APIs
- Java Development Environment
- JDK vs JRE vs JVM
- Java Bytecode
- Manual Java Compilation
- IntelliJ IDEA Setup
- Git
- GitHub
- Git Branches

---

# DAY 1 — Backend & Web Foundations

## 1. What is Backend?

Backend is the server-side part of an application responsible for:

- Business Logic
- Database Operations
- Authentication
- APIs
- Server-side Processing

The backend communicates with databases and sends responses to the frontend/client.

---

## 2. Client-Server Architecture

A basic backend application follows this flow:

```text
Client
   │
   │ HTTP Request
   ↓
Server
   │
   │ Business Logic
   ↓
Database
   │
   │ Data
   ↓
Server
   │
   │ HTTP Response
   ↓
Client

The client sends a request.

The server processes the request, performs the required operations, and returns a response.

3. HTTP

HTTP stands for:

HyperText Transfer Protocol

HTTP is a communication protocol used between clients and servers.

Common HTTP Methods
GET → Retrieve data
POST → Create/send data
PUT → Update data
DELETE → Delete data

Example:

Client
   │
   │ GET /tasks
   ↓
Backend Server
   │
   │ Response
   ↓
Client
4. API

API stands for:

Application Programming Interface

An API allows different software applications or components to communicate with each other.

Example:

Mobile App
     │
     │ HTTP Request
     ↓
  REST API
     │
     ↓
Spring Boot Backend
     │
     ↓
  Database
DAY 2 — Git & GitHub
5. Git

Git is a Version Control System (VCS).

It tracks changes in a project and allows developers to maintain different versions of their code.

6. GitHub

GitHub is an online platform used to host, store, share, and collaborate on Git repositories.

Our repository:

java-backend-journey
7. Basic Git Workflow
Working Directory
       │
       │ git add
       ↓
Staging Area
       │
       │ git commit
       ↓
Local Repository
       │
       │ git push
       ↓
GitHub
8. Git Commands Learned
Check repository status
git status

Shows:

Current branch
Modified files
Untracked files
Staged changes
Stage changes
git add filename

or:

git add .

git add moves selected changes into the staging area.

Commit changes
git commit -m "message"

A commit creates a snapshot of the staged changes in the local Git repository.

A commit is local until it is pushed.

Push changes
git push

Uploads local commits to the remote GitHub repository.

View commit history
git log --oneline

Shows previous commits in a compact format.

View connected remote repositories
git remote -v

Shows the remote repository connected to the local Git repository.

9. Staged vs Committed vs Pushed
Staged

The changes have been selected for inclusion in the next commit.

git add
   ↓
Staged
Committed

The staged changes have been saved as a snapshot in the local Git repository.

git commit
   ↓
Committed locally
Pushed

The local commits have been uploaded to GitHub.

git push
   ↓
GitHub

Therefore:

Edit
 ↓
git add
 ↓
Staged
 ↓
git commit
 ↓
Committed locally
 ↓
git push
 ↓
GitHub
10. Git Branches

A branch allows me to work on changes separately from another branch.

Our main branch:

main

Create and switch to a new branch:

git checkout -b git-practice

Switch branches:

git checkout main

Merge a branch into the current branch:

git merge git-practice

Push a new branch to GitHub:

git push -u origin git-practice
11. Branch Workflow Practiced

I practiced the complete branch workflow:

main
 │
 └── git-practice
        │
        ├── Create/change file
        ├── git add
        ├── git commit
        └── git push
                 │
                 ↓
              GitHub
                 │
                 ↓
        checkout main
                 │
                 ↓
        git merge git-practice
                 │
                 ↓
            git push

I created:

git-practice.txt

and successfully practiced:

Creating a branch
Creating a file
Checking Git status
Staging changes
Committing changes
Pushing a branch
Switching back to main
Merging a branch
Pushing the updated main
12. Important Git Observation

During practice, Git showed the same file in two different states:

Changes to be committed

and:

Changes not staged for commit

This happened because the file was staged and then modified again.

This demonstrated that the staging area contains the specific version of changes selected for the next commit.

If the file is modified after git add, the new modification is not automatically staged.

Running:

git add filename

again stages the latest version.

13. GitHub + IntelliJ Setup

IntelliJ IDEA was connected to GitHub using GitHub authentication.

The local repository was connected to the GitHub remote using:

git remote -v

Repository:

java-backend-journey

The local branch was renamed from:

master

to:

main

using:

git branch -M main

The local repository was successfully synchronized with GitHub using:

git push -u origin main

GitHub authentication was completed successfully.

14. Git Workflow For Future Development

Git is now a supporting tool for the backend journey.

The normal workflow will be:

Write Code
    ↓
git status
    ↓
git add .
    ↓
git commit -m "meaningful message"
    ↓
git push
    ↓
GitHub

The goal is to make Git part of normal development rather than treating it as a separate subject.

DAY 3 — Java Foundations
15. JDK vs JRE vs JVM
JVM — Java Virtual Machine

The JVM executes Java bytecode.

It is responsible for running compiled Java programs.

JRE — Java Runtime Environment

The JRE provides the environment required to run Java applications.

It contains:

JVM
Java runtime/class libraries
Required runtime components

The JRE is primarily concerned with running Java applications.

JDK — Java Development Kit

The JDK is used to develop Java applications.

It provides:

Java compiler (javac)
JVM/runtime components
Java development tools
Java libraries

The JDK is what developers use to write, compile, debug, and run Java applications.

16. Java Bytecode

Java source code is compiled into bytecode before execution.

The Java compiler:

javac

converts:

.java

source code into:

.class

bytecode.

The overall process:

Java Source Code
      │
      │ javac
      ↓
Bytecode (.class)
      │
      ↓
JVM
      │
      ↓
Program Execution

This is one of the reasons Java applications can run on different operating systems as long as an appropriate JVM is available.
