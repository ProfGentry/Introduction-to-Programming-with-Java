# VSCode & Java Setup
## Goal
By the end of this lab, you will be able to:
-	Install VS Code and the Java tools it needs
-	Install a Java Development Kit (JDK)
-	Create and run a Java program in VS Code
-	Connect VSCode with your GitHub account
## Instructions
### Step 1 - Install VS Code
1. [Download](https://code.visualstudio.com/download) and install Visual Studio Code
2. Lauch VS Code once it's installed
### Step 2 - Install a JDK (Java Development Kit)
You need a JDK for Java to work. 

Windows / Mac
1.	Install JDK 21 (or latest JDK available).
2.	Restart your computer after installing.

Quick check (optional but helpful):
•	Open Command Prompt (Windows) or Terminal (Mac)
•	Type:
```
java -version
javac -version
```
You should see version info for both. If javac is “not recognized,” your JDK isn’t set up right yet.
### Step 3 — Install the VS Code Java Extensions
Inside VS Code:
1.	Click the Extensions icon (looks like 4 squares) on the left.
2.	Search for: Extension Pack for Java
3.	Install it.
This pack typically includes:
-	Language Support for Java™ by Red Hat
-	Debugger for Java
-	Java Test Runner
-	Maven for Java
### Step 4 — Tell VS Code Which Java You Installed (If Needed)

In VS Code
1.	Press Ctrl + Shift + P (Windows) or Cmd + Shift + P (Mac)
2.	Search: Java: Configure Java Runtime
3.	Choose your installed JDK (21 or 17)
### Step 5 — Create Your First Java Project
1.	Press Ctrl + Shift + P / Cmd + Shift + P
2.	Search: Java: Create Java Project
3.	Choose No build tools (unless told otherwise)
4.	Pick a folder you can find again (like Documents/SDC120)

VS Code will create a project folder and a src folder.
### Step 6 — Make a “Hello World” Program
Open or create a file like Main.java inside src, and paste:
```
public class Main {
     public static void main(String[] args) {
          System.out.println("Hello, Java!");
     }
}
```
### Step 7 — Run It
You have two common ways:
**Option A (Recommended): Run Button**
•	Look for a Run / Play button near the top-right of the editor
•	Click it
**Option B: Terminal**
1.	Open Terminal in VS Code: Terminal → New Terminal
2.	Navigate into the folder if needed
3.	Compile:
```javac Main.java```
4.	Run:
```java Main```

### Step 8 — Connect Your GitHub Account to VS Code

Sign In to GitHub from VS Code
1.	Open VS Code
2.	Click the Accounts icon (little person icon) in the bottom-left corner (or) open Command Palette:
-	Ctrl + Shift + P (Windows)
-	Cmd + Shift + P (Mac)
3.	Search for: 
o	GitHub: Sign In
4.	Choose Sign in with your browser
5.	Your browser opens → log into GitHub → Authorize VS Code

VS Code will automatically connect once authorization is complete.

**Turn On GitHub Integration (If Prompted)**

Sometimes VS Code politely asks permission to help you more.

If you see a message about:
-	GitHub Pull Requests
-	GitHub Repositories
-	Source Control
Click Enable or Yes.

This is normal.
### Step 9 - Put Your Java Project Under Git Control

Now we wire your project to GitHub.

1.	Open your Java project folder in VS Code (File → Open Folder)
2.	Click the Source Control icon (branch-looking icon on the left)
3.	Click Initialize Repository

VS Code has now turned your folder into a Git repository.
### Step 10 — Publish Your Project to GitHub
1.	In Source Control, click Publish Branch
2.	Choose:
	  Public (unless told otherwise)
3.	Pick or confirm your GitHub account
4.	Name the repository (example: SDC120-Java-Week1)
VS Code will create the repo on GitHub and link it automatically.
### Step 11 — Make Your First Commit

A commit is a saved checkpoint.
1.	Make sure your Java file is saved
2.	In Source Control, type a message like:
3.	Initial Java project setup
4.	Click Commit
5.	Click Sync / Push when prompted

Your code is now:
-	Saved locally
-	Saved on GitHub
-	Recoverable if something breaks later

