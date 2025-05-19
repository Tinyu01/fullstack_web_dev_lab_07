# GitHub Repository Setup Guide

This guide will help you set up a GitHub repository for the QuickCart e-commerce application.

## Creating a New GitHub Repository

1. **Sign in to GitHub**
   - Go to [GitHub](https://github.com/) and log in to your account.

2. **Create a New Repository**
   - Click on the "+" icon in the top-right corner.
   - Select "New repository" from the dropdown menu.

3. **Configure Repository Settings**
   - Repository name: `quickcart-ecommerce`
   - Description: "An e-commerce application for managing and displaying products in an online store"
   - Visibility: Choose either "Public" or "Private" based on your preference.
   - Initialize with:
     - ✅ Add a README file
     - ✅ Add .gitignore (select "Java" template)
     - ✅ Choose a license (MIT License recommended)
   - Click "Create repository"

## Cloning the Repository

1. **Get the Repository URL**
   - On your new repository page, click the green "Code" button.
   - Copy the HTTPS or SSH URL.

2. **Clone to Your Local Machine**
   ```bash
   git clone https://github.com/yourusername/quickcart-ecommerce.git
   cd quickcart-ecommerce
   ```

## Setting Up the Project

1. **Copy Project Files**
   - Copy all the QuickCart project files into the cloned repository folder.
   - Ensure you maintain the project structure as described in `PROJECT_STRUCTURE.md`.

2. **Create a .gitignore File**
   - Add the following entries to your `.gitignore` file if they're not already included:
   ```
   HELP.md
   target/
   !.mvn/wrapper/maven-wrapper.jar
   !**/src/main/**/target/
   !**/src/test/**/target/

   ### STS ###
   .apt_generated
   .classpath
   .factorypath
   .project
   .settings
   .springBeans
   .sts4-cache

   ### IntelliJ IDEA ###
   .idea
   *.iws
   *.iml
   *.ipr

   ### NetBeans ###
   /nbproject/private/
   /nbbuild/
   /dist/
   /nbdist/
   /.nb-gradle/
   build/
   !**/src/main/**/build/
   !**/src/test/**/build/

   ### VS Code ###
   .vscode/

   ### OS Files ###
   .DS_Store
   Thumbs.db
   ```

## Adding Files to the Repository

1. **Stage All Files**
   ```bash
   git add .
   ```

2. **Commit the Changes**
   ```bash
   git commit -m "Initial commit of QuickCart e-commerce application"
   ```

3. **Push to GitHub**
   ```bash
   git push origin main
   ```

## Repository Structure

Make sure your repository has the following structure:

```
quickcart-ecommerce/
├── .git/
├── .gitignore
├── LICENSE
├── README.md
├── IMPLEMENTATION_GUIDE.md
├── PROJECT_STRUCTURE.md
├── pom.xml
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/
    │   │       └── quickcart/
    │   │           └── ecommerce/
    │   │               ├── controller/
    │   │               │   ├── HomeController.java
    │   │               │   └── ProductController.java
    │   │               ├── model/
    │   │               │   └── Product.java
    │   │               ├── service/
    │   │               │   └── ProductService.java
    │   │               └── QuickCartApplication.java
    │   └── resources/
    │       ├── static/
    │       │   ├── css/
    │       │   │   └── style.css
    │       │   └── images/
    │       │       └── placeholder.jpg
    │       ├── templates/
    │       │   ├── layout.html
    │       │   └── products/
    │       │       ├── detail.html
    │       │       └── list.html
    │       └── application.properties
    └── test/
        └── java/
            └── com/
                └── quickcart/
                    └── ecommerce/
                        └── QuickCartApplicationTests.java
```

## Updating the Repository

As you make changes to your QuickCart application, use the following workflow:

1. **Pull Latest Changes** (if working with collaborators)
   ```bash
   git pull origin main
   ```

2. **Stage Your Changes**
   ```bash
   git add .
   ```

3. **Commit Your Changes**
   ```bash
   git commit -m "Description of changes"
   ```

4. **Push to GitHub**
   ```bash
   git push origin main
   ```

## Best Practices for Commits

- Make small, focused commits that address a single issue or feature
- Write clear commit messages that explain what changes were made
- Commit often to create a detailed history of changes
- Pull before pushing to avoid merge conflicts

## Branching Strategy

For feature development, consider using feature branches:

1. **Create a Feature Branch**
   ```bash
   git checkout -b feature/shopping-cart
   ```

2. **Work on Your Feature**
   - Make changes, commit often

3. **Push Your Branch**
   ```bash
   git push origin feature/shopping-cart
   ```

4. **Create a Pull Request**
   - Go to your GitHub repository
   - Click "Pull requests" > "New pull request"
   - Select your feature branch and create the pull request

5. **Merge When Ready**
   - Review the changes
   - Merge the pull request into the main branch

This workflow keeps your main branch stable while you develop new features.