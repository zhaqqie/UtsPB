package com.example.uts.data;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("login")
    private String username;

    @SerializedName("avatar_url")
    private String avatarUrl;

    private String name;
    private String age;

    public String getUsername() {
        return username;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
