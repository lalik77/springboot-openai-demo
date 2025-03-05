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

## 🌐 Live Demo(Full Stack - not included in the repo)

The application is deployed and available for testing.

### 📝 Steps to Access:

1. **Register an account**.
2. **Confirm your email** to activate the account.
3. **Login and test the AI integration**.

🔗 **[Live App URL](https://my-ai-application.duckdns.org/)**

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