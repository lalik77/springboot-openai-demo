package com.mami.ai.service;

import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.openai.OpenAiImageModel;
import org.springframework.ai.openai.OpenAiImageOptions;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
  OpenAiImageModel openAiImageModel;

  public ImageService(OpenAiImageModel openAiImageModel) {
    this.openAiImageModel = openAiImageModel;
  }

  public ImageResponse generateImage(String prompt, String quality, int n, int width, int height) {
    // ImageResponse imageResponse = openAiImageModel.call(new ImagePrompt(prompt));
    ImageResponse imageResponse = openAiImageModel.call(
        new ImagePrompt(prompt,
            OpenAiImageOptions.builder()
                .model("dall-e-2")
                .quality(quality)
                .withN(n)
                .width(width)
                .height(height)
                .build()
        ));
    return imageResponse;
  }
}
