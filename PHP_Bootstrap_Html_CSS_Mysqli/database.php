<?php
 
// initializing variables
$firstName = "";
$email    = "";
$lastName="";
$errors = array(); 

// connect to the database
$db = mysqli_connect('localhost', 'root', '', 'northpoledb');
// REGISTER USER
if (isset($_POST['submit'])) {
  // receive all input values from the form
  $firstName = $_POST['firstName'];
  $lastName =  $_POST['lastName'];
  $email = $_POST['email'];
  $password = $_POST['password'];

  // form validation: ensure that the form is correctly filled ...
  // by adding (array_push()) corresponding error unto $errors array
  if (empty($firstName)) { echo '<script>alert("firstName is required")</script>'; }
  if (empty($lastName)) { echo '<script>alert("lastName is required")</script>'; }
   if (empty($email)) {  echo '<script>alert("Email is required")</script>';}
  if (empty($password)) { echo '<script>alert("Password is required")</script>'; }
  

  // first check the database to make sure 
  // a user does not already exist with the same username and/or email
  $user_check_query = "SELECT * FROM register WHERE email='$email' OR password='$password' LIMIT 1";
  $result = mysqli_query($db, $user_check_query);
  $user = mysqli_fetch_assoc($result);
  
  if ($user) { // if user exists
    if ($user['email'] === $email) {
      echo '<script>alert("Email already exists")</script>';
    }

    if ($user['password'] === $password) {
    echo '<script>alert("Password already exists")</script>';
    }
  }

  // Finally, register user if there are no errors in the form
  if (count($errors) == 0 && $user===null && $firstName!=null && $lastName!=null && $email!=null && $password!=null) {//encrypt the password before saving in the database

  	$query = "INSERT INTO register (email, firstName, lastName, password) 
  			  VALUES('$email', '$firstName', '$lastName', '$password')";
  	mysqli_query($db, $query);
        echo '<script>alert("Registration Successful! Log In Please!")</script>';
  }
}

