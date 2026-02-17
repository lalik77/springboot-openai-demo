### 🔄 Render Cold Start Guide
#### Overview

The backend application is deployed on Render (free tier).

Because it runs on a free hosting plan, the service may enter a sleep state after a period of inactivity. When this happens, the first request will take longer to respond due to a cold start.

How to Manually Wake Up the Backend

Open the backend base URL in your browser.

Wait for the server to respond.

During cold start, the initial response may take some time.

#### Expected Response

If the server responds with:

```json
{
  "error": "No static resource index.html."
}
```



This indicates:

✅ The backend instance has successfully started.

✅ The application is awake and ready to handle API requests.

⚠️ The message appears because there is no default index.html mapped at the root path. This is expected behavior for a backend-only service.

### What to Do Next

Once you receive this response:

The backend is fully operational.

You can proceed to use the frontend application normally.

Subsequent requests should respond significantly faster.