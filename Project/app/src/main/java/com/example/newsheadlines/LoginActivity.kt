//@file:Suppress("DEPRECATION")
//
//package com.example.newsheadlines
//
//import android.content.Context
//import android.content.Intent
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Lock
//import androidx.compose.material.icons.filled.Person
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.Divider
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextButton
//import androidx.compose.material3.TextField
//import androidx.compose.material3.TextFieldDefaults
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.input.PasswordVisualTransformation
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.core.content.ContextCompat
//import androidx.core.content.ContextCompat.startActivity
//import com.example.newsheadlines.ui.theme.NewsHeadlinesTheme
//
//class LoginActivity : ComponentActivity() {
//    private lateinit var databaseHelper: UserDatabaseHelper
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        databaseHelper = UserDatabaseHelper(this)
//        setContent {
//
//            LoginScreen(this, databaseHelper)
//        }
//    }
//}
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun LoginScreen(context: Context, databaseHelper: UserDatabaseHelper) {
//    var username by remember { mutableStateOf("") }
//    var password by remember { mutableStateOf("") }
//    var error by remember { mutableStateOf("") }
//
//    Column(
//        Modifier
//            .fillMaxHeight()
//            .fillMaxWidth()
//            .padding(28.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center)
//
//    {
//        Image(
//            painter = painterResource(id = R.drawable.news),
//            contentDescription = "")
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//
//        Row {
//            Divider(color = Color.LightGray, thickness = 2.dp, modifier = Modifier
//                .width(155.dp)
//                .padding(top = 20.dp, end = 20.dp))
//            Text(text = "Login",
//                color = Color(0xFF6495ED),
//                fontWeight = FontWeight.Bold,
//                fontSize = 24.sp, style = MaterialTheme.typography.headlineLarge
//            )
//            Divider(color = Color.LightGray, thickness = 2.dp, modifier = Modifier
//                .width(155.dp)
//                .padding(top = 20.dp, start = 20.dp))
//
//        }
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//        TextField(
//            value = username,
//            onValueChange = { username = it },
//            leadingIcon = {
//                Icon(
//                    imageVector = Icons.Default.Person,
//                    contentDescription = "personIcon",
//                    tint = Color(0xFF6495ED)
//                )
//            },
//            placeholder = {
//                Text(
//                    text = "username",
//                    color = Color.Black
//                )
//            },
//            colors = TextFieldDefaults.textFieldColors(containerColor = Color.Transparent)
//        )
//
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        TextField(
//            value = password,
//            onValueChange = { password = it },
//            leadingIcon = {
//                Icon(
//                    imageVector = Icons.Default.Lock,
//                    contentDescription = "lockIcon",
//                    tint = Color(0xFF6495ED)
//                )
//            },
//            placeholder = { Text(text = "password", color = Color.Black) },
//            visualTransformation = PasswordVisualTransformation(),
//            colors = TextFieldDefaults.textFieldColors(containerColor = Color.Transparent)
//        )
//
//
//
//        Spacer(modifier = Modifier.height(12.dp))
//        if (error.isNotEmpty()) {
//            Text(
//                text = error,
//                color = MaterialTheme.colorScheme.error,
//                modifier = Modifier.padding(vertical = 16.dp)
//            )
//        }
//
//        Button(
//            onClick = {
//                if (username.isNotEmpty() && password.isNotEmpty()) {
//                    val user = databaseHelper.getUserByUsername(username)
//                    if (user != null && user.password == password) {
//                        error = "Successfully log in"
//                        val MainPage = null
//                        context.startActivity(
//                            Intent(
//                                context,
//                                MainActivity::class.java
//                            )
//                        )
//                        //onLoginSuccess()
//                    } else {
//                        error = "Invalid username or password"
//                    }
//                } else {
//                    error = "Please fill all fields"
//                }
//            },
//            shape = RoundedCornerShape(20.dp),
//            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF77a2ef))
//            ,
//            modifier = Modifier.width(200.dp)
//                .padding(top = 16.dp)
//        ) {
//            Text(text = "Log In", fontWeight = FontWeight.Bold)
//        }
//
//        Row(modifier = Modifier.fillMaxWidth()) {
//            TextButton(onClick = {
//                context.startActivity(
//                    Intent(
//                        context,
//                        RegistrationActivity::class.java
//                    ))})
//            { Text(text = "Sign up",
//                color = Color.Black
//            )}
//
//            Spacer(modifier = Modifier.width(100.dp))
//
//            TextButton(onClick = { /* Do something! */ })
//            { Text(text = "Forgot password ?",
//                color = Color.Black
//            )}
//        }
//
//
//
//
//    }
//}
//private fun startMainActivity(context: Context) {
//    val intent = Intent(context, MainActivity::class.java)
//    ContextCompat.startActivity(context, intent, null)
//}
@file:Suppress("DEPRECATION")

package com.example.newsheadlines

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsheadlines.ui.theme.NewsHeadlinesTheme

class LoginActivity : ComponentActivity() {
    private lateinit var databaseHelper: UserDatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databaseHelper = UserDatabaseHelper(this)
        setContent {
            LoginScreen(this, databaseHelper)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(context: Context, databaseHelper: UserDatabaseHelper) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var error by remember { mutableStateOf("") }

    Column(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(28.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.news), contentDescription = "")
        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Divider(color = Color.LightGray, thickness = 2.dp, modifier = Modifier
                .width(155.dp)
                .padding(top = 20.dp, end = 20.dp))
            Text(
                text = "Login",
                color = Color(0xFF6495ED),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                style = MaterialTheme.typography.headlineLarge
            )
            Divider(color = Color.LightGray, thickness = 2.dp, modifier = Modifier
                .width(155.dp)
                .padding(top = 20.dp, start = 20.dp))
        }

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = username,
            onValueChange = { username = it },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Person, contentDescription = "personIcon", tint = Color(0xFF6495ED))
            },
            placeholder = { Text(text = "Username", color = Color.Black) },
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.Transparent)
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = password,
            onValueChange = { password = it },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = "lockIcon", tint = Color(0xFF6495ED))
            },
            placeholder = { Text(text = "Password", color = Color.Black) },
            visualTransformation = PasswordVisualTransformation(),
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.Transparent)
        )

        Spacer(modifier = Modifier.height(12.dp))
        if (error.isNotEmpty()) {
            Text(text = error, color = MaterialTheme.colorScheme.error, modifier = Modifier.padding(vertical = 16.dp))
        }

        Button(
            onClick = {
                if (username.isNotEmpty() && password.isNotEmpty()) {
                    val user = databaseHelper.getUserByUsername(username)
                    if (user != null && user.password == password) {
                        error = "Successfully logged in"
                        context.startActivity(Intent(context, MainActivity::class.java))
                        // Finish the LoginActivity if needed
                        // (context as Activity).finish()
                    } else {
                        error = "Invalid username or password"
                    }
                } else {
                    error = "Please fill all fields"
                }
            },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF77a2ef)),
            modifier = Modifier.width(200.dp).padding(top = 16.dp)
        ) {
            Text(text = "Log In", fontWeight = FontWeight.Bold)
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            TextButton(onClick = { context.startActivity(Intent(context, RegistrationActivity::class.java)) }) {
                Text(text = "Sign up", color = Color.Black)
            }
            Spacer(modifier = Modifier.width(100.dp))
            TextButton(onClick = { /* Handle forgot password */ }) {
                Text(text = "Forgot password?", color = Color.Black)
            }
        }
    }
}
