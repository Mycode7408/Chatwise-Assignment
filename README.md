**Product List Application
**This Android application demonstrates how to display a list of products using RecyclerView with a ViewModel and LiveData. It includes three main screens: Main Screen, Product List Screen, and Product Detail Screen.


Screenshots:
![Screenshot (26)](https://github.com/user-attachments/assets/5f727f4f-e32a-49de-ab5b-06a3e2c7ebef)
![Screenshot (27)](https://github.com/user-attachments/assets/b3335d8f-24f1-4d41-ae48-f011eac6fadc)
![Screenshot (27)](https://github.com/user-attachments/assets/52a5a6b4-ef14-45b4-9135-8742adad1714)
![Screenshot (26)](https://github.com/user-attachments/assets/9890f521-1949-4254-8642-77112715b91f)



Features
Main Screen: Contains a button to navigate to the product list.
Product List Screen: Displays a list of products fetched from a repository.
Product Detail Screen: Shows detailed information about a selected product.
File Structure
Kotlin Files
MainActivity.kt



The main activity that starts the ProductListActivity.
ProductListActivity.kt

Displays the list of products using RecyclerView.
ProductDetailActivity.kt

Displays detailed information about a selected product.
ProductAdapter.kt

Adapter for the RecyclerView to manage and display product items.
ProductViewModel.kt

ViewModel for managing product data.
XML Layout Files
activity_main.xml

Layout for the main activity.
product_list.xml

Layout for the product list activity.
product_detail.xml

Layout for the product detail activity.
item_title.xml

Layout for the title item in the RecyclerView.
item_product.xml

Layout for the product item in the RecyclerView.
AndroidManifest.xml
Declares all activities used in the application.
Usage
MainActivity.kt

Starts ProductListActivity when the "View Products" button is clicked.
ProductListActivity.kt

Fetches product data from ProductViewModel and displays it using RecyclerView.
ProductDetailActivity.kt

Displays product details passed via an intent.
ProductAdapter.kt

Adapter for RecyclerView to handle different view types and bind data.
ProductViewModel.kt

Fetches product data using a repository.
Setup and Installation
Clone the repository.
Open the project in Android Studio.
Build and run the application on an emulator or a physical device.
Dependencies
AndroidX Libraries
Glide for image loading
License
This project is licensed under the MIT License.
