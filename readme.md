This is a demo backend project integrating **ChatGPT API** with **Spring AI**.  
It uses `spring-ai-openai-spring-boot-starter` to interact with OpenAI's API and provides a simple backend for
generating AI responses.

## 🚀 Features

- **Spring Boot backend with Spring AI**.
- **Integration with OpenAI ChatGPT API**.- 
- **Three main AI-powered functionalities**: <br>
    1 . **Generate Images** – Create images using AI.<br>
    2 . **Recipe Creator** – Generate cooking recipes based on ingredients.<br>
    3 . **Ask AI** – Ask general questions and get AI-powered responses.

## 🌐 Deployed Full-Stack Application ([about](full-stack.md)) 

⚠️ The full-stack application is not included in this repository.
   The application is deployed and available for testing.

📘 Cold Start Guide: [Render Cold Start Instructions](RENDER_COLD_START.md) 

### 📝 Steps to Access:

1. **Register an account**.
2. **Confirm your email** to activate the account.
3. **Login and test the AI integration**.

🔗 **[Live Demo](https://ai.mamialex.ru/)**

⚙️ Backend Deployment Note

The backend application is deployed on [Render](https://ai-app-sb-1-0.onrender.com/) (free tier).

Because the service runs on a free hosting plan:

The application may enter a sleep state after a period of inactivity.

The first request after inactivity can take additional time (cold start).

Response times may occasionally be slower compared to paid infrastructure.

Once the service is awake, subsequent requests should respond normally.


## 🛠️ Technologies Used 

- **Spring Boot**
- **Spring AI** (`spring-ai-openai-spring-boot-starter`)
- **OpenAI API**

## 🏗️ Setup & Installation

### 1️⃣ Clone the Repository

```shell
git clone https://github.com/lalik77/springboot-openai-demo.git
cd springboot-openai-demo
```

### 2️⃣ Configure API Key

Set your OpenAI API key in application.properties or application.yml:

``` 
spring.ai.openai.api-key=your_openai_api_key
  ```

### 3️⃣ Run the Application

Use Maven to build and run the Spring Boot app:

``` shell
mvn spring-boot:run
```

## 4️⃣ Test the API
Send a GET request using Postman or cURL:

``` shell
curl "http://localhost:8080/api/ask-ai?prompt=Tell me a joke"
```

📜 License
This project is licensed under the MIT License.