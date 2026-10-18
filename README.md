# StudentListJava

**StudentListJava** is a simple Java console application that demonstrates student record management using Java's `HashMap` collection.

The program collects student numbers and first names, displays the student list, removes the last entered record, and allows the user to add a new student record.

This project is intended for beginners learning Java collections, key-value pairs, loops, and console input.

## Features

- Collects three initial student records.
- Stores student numbers as keys and first names as values.
- Displays the current student list.
- Removes the last entered student record.
- Accepts a new student number and first name.
- Adds the new record to the collection.
- Displays the updated student list.

## Requirements

- Java Development Kit (JDK) 21
- Maven
- A Java-compatible IDE, such as NetBeans, or a terminal

## Project Structure

```text
StudentListJava/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            └── com/
                └── mycompany/
                    └── studentlist/
                        └── StudentList.java
```

## How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/ichiroyamazaki/StudentListJava.git
cd StudentListJava
```

### 2. Compile the Project

```bash
mvn compile
```

### 3. Run the Application

```bash
mvn exec:java
```

The Maven project specifies `com.mycompany.studentlist.StudentList` as its main class. You can also open the project in NetBeans and run the `StudentList` class.

## How It Works

1. The program creates a `HashMap<String, String>` named `students`.
2. It prompts the user to enter three student numbers and first names.
3. Each student number is stored as a key, with the first name as its value.
4. The program displays the student records.
5. It removes the last entered student record using `students.remove(id)`.
6. The user enters a new student number and first name.
7. The program adds the new record and displays the updated list.

## Example

```text
Enter student number 1: 1001
Enter first name 1: Alex
Enter student number 2: 1002
Enter first name 2: Jamie
Enter student number 3: 1003
Enter first name 3: Taylor
Student List:
1001 Alex
1002 Jamie
1003 Taylor
Enter your student number: 1004
Enter your first name: Chris
Student List:
1001 Alex
1002 Jamie
1004 Chris
```

*Note: The order of records displayed by a `HashMap` is not guaranteed.*

## Concepts Demonstrated

- **HashMap:** Stores student records as key-value pairs.
- **Generics:** Uses `HashMap<String, String>` for student numbers and names.
- **Loops:** Collects and displays multiple student records.
- **Scanner:** Reads user input from the console.
- **`put()`:** Adds or updates a student record.
- **`remove()`:** Removes a record using its student number.
- **Packages:** Organizes the class under `com.mycompany.studentlist`.

## Limitations

- The program accepts exactly three initial student records.
- Only student numbers and first names are stored.
- Reusing a student number overwrites the existing record.
- The program automatically removes the last entered record rather than asking the user which record to delete.
- Data is not saved after the program closes.
- Input validation is not implemented.

## Author

**Ichiro Yamazaki**

## License

No license is currently specified in this repository. Check the repository for licensing information before redistributing or modifying the project.
