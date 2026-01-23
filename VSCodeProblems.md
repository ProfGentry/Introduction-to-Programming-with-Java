# Common Problems (and Fast Fixes)

## “Java not found” / “javac not recognized”
Cause: JDK not installed OR PATH not set (Windows).
Fix:
-	Reinstall JDK
-	Restart computer
-	Re-run java -version and javac -version

## VS Code says it can’t find a Java runtime
Fix:
-	Ctrl/Cmd + Shift + P → Java: Configure Java Runtime
-	Select the correct JDK

## “Main method not found”
Cause: Your main method is missing or misspelled.
Make sure it is exactly:
public static void main(String[] args)

## File name/class name mismatch
If your file is Main.java, your class must be:
public class Main

## “Package” problems
If you’re just starting out, keep it simple:
•	Don’t add package lines unless your instructor says to.

## “Source Control tab is empty”
•	You didn’t open the folder
•	Fix: File → Open Folder, not “Open File”

## VS Code keeps asking me to sign in
•	You canceled browser authorization
•	Fix: Run GitHub: Sign In again

## I committed but nothing shows on GitHub
•	You committed locally but didn’t Push
•	Fix: Click Sync Changes

## I broke everything
•	Congratulations, you’re programming
•	Fix: Use GitHub history or ask before deleting files



