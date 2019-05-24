package com.example.channel;

import java.io.Serializable;

public class Channel implements Serializable {
    private String title;
    private String quality;
    private String url;
    private String logo;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getLogo() {
            return logo;
        }
     public void setLogo(String logo) {
            this.logo = logo;
    }
}
