package com.mami.ai.controller;

import com.mami.ai.service.ChatService;
import com.mami.ai.service.ImageService;
import com.mami.ai.service.RecipeService;
import java.io.IOException;
import java.util.List;
import org.springframework.ai.image.ImageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GenAiController {
  private final ChatService chatService;
  private final ImageService imageService;
  private final RecipeService recipeService;

  public GenAiController(ChatService chatService, ImageService imageService, RecipeService recipeService) {
    this.chatService = chatService;
    this.imageService = imageService;
    this.recipeService = recipeService;
  }

  @GetMapping("/ask-ai")
  public String getResponse(@RequestParam String prompt) {
    return chatService.getResponse(prompt);
  }

  @GetMapping("/ask-ai-options")
  public String getResponseOptions(@RequestParam String prompt) {
    return chatService.getResponseOptions(prompt);
  }

  // Returns a redirection to one image url

  /*    @GetMapping("/generate-image")
        public void generateImages(HttpServletResponse response, @RequestParam String prompt) throws IOException {
        ImageResponse imageResponse = imageService.generateImage(prompt);
        String url = imageResponse.getResult().getOutput().getUrl();
        response.sendRedirect(url);
  }*/

  @GetMapping("/generate-image")
  public List<String> generateImages(@RequestParam String prompt,
                                     @RequestParam(defaultValue = "hd") String quality,
                                     @RequestParam(defaultValue = "1") int n,
                                     @RequestParam(defaultValue = "1024") int width,
                                     @RequestParam(defaultValue = "1024") int height) throws IOException {
    ImageResponse imageResponse = imageService.generateImage(prompt, quality, n, width, height);

    return imageResponse.getResults().stream()
        .map(result -> result.getOutput().getUrl())
        .toList();
  }

  @GetMapping("recipe-creator")
  public String recipeCreator(@RequestParam String ingredients,
                              @RequestParam(defaultValue = "any") String cuisine,
                              @RequestParam(defaultValue = "") String dietaryRestriction) {
    return recipeService.createRecipe(ingredients, cuisine, dietaryRestriction);
  }
}
