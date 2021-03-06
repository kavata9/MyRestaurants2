
package com.restaurants.agnes.myrestaurants.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {

    private String id;
    private String alias;
    private String name;
    private String imageUrl;
    private Boolean isClosed;
    private String url;
    private Integer reviewCount;
    private List<Category> categories = null;
    private Double rating;
    private Coordinates coordinates;
    private List<Object> transactions = null;
    private String price;
    private Location location;
    private String phone;
    private String displayPhone;
    private Double distance;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Restaurant() {
    }

    /**
     * 
     * @param transactions
     * @param phone
     * @param location
     * @param alias
     * @param imageUrl
     * @param url
     * @param displayPhone
     * @param id
     * @param distance
     * @param price
     * @param name
     * @param reviewCount
     * @param categories
     * @param rating
     * @param isClosed
     * @param coordinates
     */
    public Restaurant(String id, String alias, String name, String imageUrl, Boolean isClosed, String url, Integer reviewCount, List<Category> categories, Double rating, Coordinates coordinates, List<Object> transactions, String price, Location location, String phone, String displayPhone, Double distance) {
        super();
        this.id = id;
        this.alias = alias;
        this.name = name;
        this.imageUrl = imageUrl;
        this.isClosed = isClosed;
        this.url = url;
        this.reviewCount = reviewCount;
        this.categories = categories;
        this.rating = rating;
        this.coordinates = coordinates;
        this.transactions = transactions;
        this.price = price;
        this.location = location;
        this.phone = phone;
        this.displayPhone = displayPhone;
        this.distance = distance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public List<Object> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Object> transactions) {
        this.transactions = transactions;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDisplayPhone() {
        return displayPhone;
    }

    public void setDisplayPhone(String displayPhone) {
        this.displayPhone = displayPhone;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
