# Mini-Project

This project contain in memory database H2 having two predefined table i.e TBL_USER AND TBL_SWEETS.

Follwing are the endpoint :
import the below CURL command in postman for testing

# 0. Login : localhost:8080/login/Kumar/kumar1234      
      #localhost:8080/login/{id}/{pass}

# 1. Get All Sweets :  localhost:8080/get/allsweets

# 2. Add new Sweets : curl --location --request POST 'localhost:8080/add/sweets' \
--header 'jwt: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoVG9rZW4iOiJyRmYzeG00ZnpKclpSQVpOUGJ1RCIsImxvZ2luSWQiOiIrOTE3MDIwNDQ1OTU2IiwiaWF0IjoxNjM3NjUxOTUwLCJleHAiOjE2Mzc3MzgzNTB9.YHnjwzxJA_36SLQFlsFjYZ8SzWZ_O3QryOTVq-MCVg8' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"Gulab Jamun",
    "img":"https://www.spiceupthecurry.com/wp-content/uploads/2020/08/gulab-jamun-recipe-2-500x500.jpg",
    "price": 200.45,
    "qty":"1 KG"
}'

# 3. Update sweets : curl --location --request POST 'localhost:8080/update/sweets/5' \
--header 'jwt: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoVG9rZW4iOiJyRmYzeG00ZnpKclpSQVpOUGJ1RCIsImxvZ2luSWQiOiIrOTE3MDIwNDQ1OTU2IiwiaWF0IjoxNjM3NjUxOTUwLCJleHAiOjE2Mzc3MzgzNTB9.YHnjwzxJA_36SLQFlsFjYZ8SzWZ_O3QryOTVq-MCVg8' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"Kala Jamun",
    "img":"https://www.spiceupthecurry.com/wp-content/uploads/2020/08/gulab-jamun-recipe-2-500x500.jpg",
    "price": 250.45,
    "qty":"1 KG"
}'
