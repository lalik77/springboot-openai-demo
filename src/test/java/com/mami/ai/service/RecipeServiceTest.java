package com.mami.ai.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.model.Generation;
import org.springframework.ai.chat.prompt.Prompt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class) // Enables Mockito in JUnit 5
public class RecipeServiceTest {

    @Mock
    private ChatModel chatModel; // Mock the ChatModel dependency

    @InjectMocks
    private RecipeService recipeService; // Inject the mock into RecipeService

    @BeforeEach
    void setUp() {
        // No additional setup needed for this test
    }

    @Test
    void testCreateRecipe() {
        // Arrange
        String ingredients = "tomatoes, onions, garlic";
        String cuisine = "Italian";
        String dietaryRestrictions = "vegetarian";

        // Mock the ChatResponse and its dependencies
        String expectedRecipe = "Recipe Title: Pasta\nIngredients: tomatoes, onions, garlic\nInstructions: ...";

        // Mock the Generation class
        Generation mockGeneration = mock(Generation.class);
        when(mockGeneration.getOutput()).thenReturn(new AssistantMessage(expectedRecipe));

        // Mock the ChatResponse class
        ChatResponse mockResponse = mock(ChatResponse.class);
        when(mockResponse.getResult()).thenReturn(mockGeneration);

        // Mock the behavior of ChatModel
        when(chatModel.call(any(Prompt.class))).thenReturn(mockResponse);

        // Act
        String actualRecipe = recipeService.createRecipe(ingredients, cuisine, dietaryRestrictions);

        // Assert
        assertEquals(expectedRecipe, actualRecipe, "The returned recipe should match the expected recipe");
    }
}