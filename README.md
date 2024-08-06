# Product List Application

This Android application demonstrates how to display a list of products using `RecyclerView` with a ViewModel and LiveData. It includes three main screens: **Main Screen**, **Product List Screen**, and **Product Detail Screen**.

## Features

- **Main Screen**: Contains a button to navigate to the product list.
- **Product List Screen**: Displays a list of products fetched from a repository.
- **Product Detail Screen**: Shows detailed information about a selected product.

## Screenshots

### Main Screen
![Screenshot (26)](https://github.com/user-attachments/assets/9d6dd485-d0e2-443d-8e78-c84b250b71dc)

### Product List Screen
![Screenshot (27)](https://github.com/user-attachments/assets/0c00cc46-6c02-40d4-942e-0833a98bfe3d)

### Product Detail Screen
![Screenshot (28)](https://github.com/user-attachments/assets/5a3f2c8f-49ce-4040-906a-c5ee1f62a742)

## File Structure

### Kotlin Files

1. **MainActivity.kt**
   - The main activity that starts the `ProductListActivity`.

2. **ProductListActivity.kt**
   - Displays the list of products using `RecyclerView`.

3. **ProductDetailActivity.kt**
   - Displays detailed information about a selected product.

4. **ProductAdapter.kt**
   - Adapter for the `RecyclerView` to manage and display product items.

5. **ProductViewModel.kt**
   - ViewModel for managing product data.

### XML Layout Files

1. **activity_main.xml**
   - Layout for the main activity.

2. **product_list.xml**
   - Layout for the product list activity.

3. **product_detail.xml**
   - Layout for the product detail activity.

4. **item_title.xml**
   - Layout for the title item in the `RecyclerView`.

5. **item_product.xml**
   - Layout for the product item in the `RecyclerView`.

### AndroidManifest.xml

- Declares all activities used in the application.

## Usage

1. **MainActivity.kt**
   - Starts `ProductListActivity` when the "View Products" button is clicked.

2. **ProductListActivity.kt**
   - Fetches product data from `ProductViewModel` and displays it using `RecyclerView`.

3. **ProductDetailActivity.kt**
   - Displays product details passed via an intent.

4. **ProductAdapter.kt**
   - Adapter for `RecyclerView` to handle different view types and bind data.

5. **ProductViewModel.kt**
   - Fetches product data using a repository.

## Setup and Installation

1. **Clone the repository**.
2. **Open the project in Android Studio**.
3. **Build and run** the application on an emulator or a physical device.

## Dependencies

- **AndroidX Libraries**
- **Glide** for image loading

## License

This project is licensed under the **MIT License**.


---

