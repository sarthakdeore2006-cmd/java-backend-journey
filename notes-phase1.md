# DAY 1 — Backend & Web Foundations

## 1. Backend Development

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
```

The client sends a request.

The server processes the request, performs the required operations, and returns a response.

---

## 3. HTTP

HTTP stands for:

**HyperText Transfer Protocol**

HTTP is a communication protocol used between clients and servers.

### Common HTTP Methods

| Method | Purpose |
|---|---|
| `GET` | Retrieve data |
| `POST` | Create/send data |
| `PUT` | Update data |
| `DELETE` | Delete data |

### Example

```text
Client
   │
   │ GET /tasks
   ↓
Backend Server
   │
   │ Response
   ↓
Client
```

---

## 4. API

API stands for:

**Application Programming Interface**

An API allows different software applications or components to communicate with each other.

### Example

```text
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
```

---

# DAY 2 — Git & GitHub

## 5. Git

Git is a **Version Control System (VCS)**.

It tracks changes in a project and allows developers to maintain different versions of their code.

---

## 6. GitHub

GitHub is an online platform used to host, store, share, and collaborate on Git repositories.

### Our Repository

```text
java-backend-journey
```

---

## 7. Basic Git Workflow

```text
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
```

---

## 8. Git Commands Learned

### Check Repository Status

```bash
git status
```

Shows:

- Current branch
- Modified files
- Untracked files
- Staged changes

---

### Stage Changes

```bash
git add filename
```

or:

```bash
git add .
```

`git add` moves selected changes into the staging area.

---

### Commit Changes

```bash
git commit -m "message"
```

A commit creates a snapshot of the staged changes in the local Git repository.

A commit is local until it is pushed.

---

### Push Changes

```bash
git push
```

Uploads local commits to the remote GitHub repository.

---

### View Commit History

```bash
git log --oneline
```

Shows previous commits in a compact format.

---

### View Connected Remote Repositories

```bash
git remote -v
```

Shows the remote repository connected to the local Git repository.

---

## 9. Staged vs Committed vs Pushed

### Staged

The changes have been selected for inclusion in the next commit.

```text
git add
   ↓
Staged
```

### Committed

The staged changes have been saved as a snapshot in the local Git repository.

```text
git commit
   ↓
Committed locally
```

### Pushed

The local commits have been uploaded to GitHub.

```text
git push
   ↓
GitHub
```

### Complete Flow

```text
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
```

---

## 10. Git Branches

A branch allows me to work on changes separately from another branch.

### Our Main Branch

```text
main
```

### Create and Switch to a New Branch

```bash
git checkout -b git-practice
```

### Switch Branches

```bash
git checkout main
```

### Merge a Branch

```bash
git merge git-practice
```

### Push a New Branch to GitHub

```bash
git push -u origin git-practice
```

---

## 11. Branch Workflow Practiced

I practiced the complete branch workflow:

```text
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
```

I created:

```text
git-practice.txt
```

and successfully practiced:

- Creating a branch
- Creating a file
- Checking Git status
- Staging changes
- Committing changes
- Pushing a branch
- Switching back to `main`
- Merging a branch
- Pushing the updated `main`

---

## 12. Important Git Observation

During practice, Git showed the same file in two different states:

```text
Changes to be committed
```

and:

```text
Changes not staged for commit
```

This happened because the file was staged and then modified again.

This demonstrated that the staging area contains the specific version of changes selected for the next commit.

If the file is modified after `git add`, the new modification is not automatically staged.

Running:

```bash
git add filename
```

again stages the latest version.

---

## 13. GitHub + IntelliJ Setup

IntelliJ IDEA was connected to GitHub using GitHub authentication.

The local repository was connected to the GitHub remote using:

```bash
git remote -v
```

### Repository

```text
java-backend-journey
```

The local branch was renamed from:

```text
master
```

to:

```text
main
```

using:

```bash
git branch -M main
```

The local repository was successfully synchronized with GitHub using:

```bash
git push -u origin main
```

GitHub authentication was completed successfully.

---

## 14. Git Workflow for Future Development

Git is now a supporting tool for the backend journey.

The normal workflow will be:

```text
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
```

The goal is to make Git part of normal development rather than treating it as a separate subject.

---

# DAY 3 — Java Foundations

## 15. JDK vs JRE vs JVM

### JVM — Java Virtual Machine

The JVM executes Java bytecode.

It is responsible for running compiled Java programs.

---

### JRE — Java Runtime Environment

The JRE provides the environment required to run Java applications.

It contains:

- JVM
- Java runtime/class libraries
- Required runtime components

The JRE is primarily concerned with running Java applications.

---

### JDK — Java Development Kit

The JDK is used to develop Java applications.

It provides:

- Java compiler (`javac`)
- JVM/runtime components
- Java development tools
- Java libraries

The JDK is what developers use to write, compile, debug, and run Java applications.

---

## 16. Java Bytecode

Java source code is compiled into bytecode before execution.

The Java compiler:

```text
javac
```

converts:

```text
.java
```

source code into:

```text
.class
```

bytecode.

### Overall Process

```text
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
```

This is one of the reasons Java applications can run on different operating systems as long as an appropriate JVM is available.
