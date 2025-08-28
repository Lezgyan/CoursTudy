package com.example.CoursTudy.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;



public class CourseUpdate {


    private UUID categoryId;

    @NotBlank(message = "Course doesn't have a title")
    private String title;

    @NotBlank(message = "У курса отсутствует описание")
    private String description;

    private String suggestedDuration;


    private UUID createBy;

    private UUID updateBy;

    public UUID getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(UUID updateBy) {
        this.updateBy = updateBy;
    }

    public UUID getCreateBy() {
        return createBy;
    }

    public void setCreateBy(UUID createBy) {
        this.createBy = createBy;
    }

    public String getSuggestedDuration() {
        return suggestedDuration;
    }

    public void setSuggestedDuration(String suggestedDuration) {
        this.suggestedDuration = suggestedDuration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }

}
