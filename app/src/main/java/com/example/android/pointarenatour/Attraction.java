package com.example.android.pointarenatour;

/**
 *  {@Link Attraction} represent a Attraction that represent a entry for each attraction
 */

public class Attraction {
    private String mAttractionName;
    private String mAttractionAddress;
    private String mAttractionDescription;

    private int mAttractionImageResource = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Attraction object
     * @param AttractionName is the name of the attraction Attraction
     * @param AttractionAddress is the address of the attraction Attraction
     * @param AttractionDescription is the description of the attraction Attraction
     */
    public Attraction(String AttractionName, String AttractionAddress, String AttractionDescription) {
        mAttractionName = AttractionName;
        mAttractionAddress = AttractionAddress;
        mAttractionDescription = AttractionDescription;
    }

    /**
     * Create a new Attraction object
     * @param AttractionName is the name of the attraction Attraction
     * @param AttractionAddress is the address of the attraction Attraction
     * @param AttractionDescription is the description of the attraction Attraction
     * @param AttractionImageResource is the image resource for the attraction Attraction
     */
    public Attraction(String AttractionName, String AttractionAddress, String AttractionDescription, int AttractionImageResource) {
        mAttractionName = AttractionName;
        mAttractionAddress = AttractionAddress;
        mAttractionDescription = AttractionDescription;
        mAttractionImageResource = AttractionImageResource;
    }

    public String getAttractionName() { return mAttractionName; }

    public String getAttractionAddress() { return mAttractionAddress; }

    public String getAttractionDescription() { return mAttractionDescription; }

    public int getAttractionImageResource() { return mAttractionImageResource; }

    public boolean hasImage() { return mAttractionImageResource != NO_IMAGE_PROVIDED; }
}

