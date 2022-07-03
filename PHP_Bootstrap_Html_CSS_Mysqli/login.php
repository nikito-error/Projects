<?php
session_start();
 
// initializing variables
$email1= "";
// connect to the database
// REGISTER USER
if(isset($_SESSION['email1']))   // Checking whether the session is already there or not if 
                              // true then header redirect it to the home page directly 
{
    session_destroy();
    echo '<script>alert("Logout Successfully")</script>';
    
 }
if (isset($_POST['login'])) {
  // receive all input values from the form
  $email1 = $_POST['email1'];
  $password1 = $_POST['password1'];

  // form validation: ensure that the form is correctly filled ...
  // by adding (array_push()) corresponding error unto $errors array
   if (empty($email1)) {  echo '<script>alert("Email is required")</script>';}
  if (empty($password1)) { echo '<script>alert("Password is required")</script>'; }
  

  // first check the database to make sure 
  // a user does not already exist with the same username and/or email
  $user_check_query1 = "SELECT * FROM register WHERE email='$email1' AND password='$password1' LIMIT 1";
  $result1 = mysqli_query($db, $user_check_query1);
  $user1 = mysqli_fetch_assoc($result1);
  
  if ($user1) { // if user exists
      $_SESSION['email1'] = $email1;
  	$_SESSION['success'] = "You are now logged in";
      echo '<script>alert("Login Successfully")</script>';
    }else{
        echo '<script>alert("Invalid Login.Please check your email or password!")</script>';
    }
  }
 



