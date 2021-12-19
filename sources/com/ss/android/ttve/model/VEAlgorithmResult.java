package com.ss.android.ttve.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public class VEAlgorithmResult {
    public static final String[] tags = {"baby", "beach", "building", "car", "cartoon", "cat", "dog", "flower", "food", "group", "hill", "indoor", "lake", "nightscape", "selfie", "sky", "statue", "street", "sunset", "text", "tree", "others"};
    private C1CategoryItem[] categoryItems;
    private int[] cluster_ids;
    private ArrayList<ArrayList<Integer>> clusters;
    private int errorCode;
    private int faceCount;
    private float[] faceFeatures;
    private float face_score;
    private byte[] featureByte;
    private float quality_score;
    private float score;
    private float sharpness_score;
    private float similarityScore;

    public static class C1CategoryItem {
        private float prob;
        private boolean satisfied;
        private String tag;

        static {
            Covode.recordClassIndex(37644);
        }

        public C1CategoryItem() {
        }

        public float getProb() {
            return this.prob;
        }

        public String getTag() {
            return this.tag;
        }

        public boolean isSatisfied() {
            return this.satisfied;
        }

        public void setProb(float f2) {
            this.prob = f2;
        }

        public void setSatisfied(boolean z) {
            this.satisfied = z;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public C1CategoryItem(float f2, boolean z, int i2) {
            setProb(f2);
            setSatisfied(z);
            this.tag = VEAlgorithmResult.tags[i2];
        }
    }

    public C1CategoryItem[] getCategoryItems() {
        return this.categoryItems;
    }

    public int[] getClusterIDs() {
        return this.cluster_ids;
    }

    public ArrayList<ArrayList<Integer>> getClusters() {
        return this.clusters;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public int getFaceCount() {
        return this.faceCount;
    }

    public float[] getFaceFeatures() {
        return this.faceFeatures;
    }

    public float getFaceScore() {
        return this.face_score;
    }

    public byte[] getFeatureByte() {
        return this.featureByte;
    }

    public float getQualityScore() {
        return this.quality_score;
    }

    public float getScore() {
        return this.score;
    }

    public float getSharpnessScore() {
        return this.sharpness_score;
    }

    public float getSimilarityScore() {
        return this.similarityScore;
    }

    static {
        Covode.recordClassIndex(37643);
    }

    public void setCategoryItems(C1CategoryItem[] c1CategoryItemArr) {
        this.categoryItems = c1CategoryItemArr;
    }

    public void setClusterIDs(int[] iArr) {
        this.cluster_ids = iArr;
    }

    public void setClusters(ArrayList<ArrayList<Integer>> arrayList) {
        this.clusters = arrayList;
    }

    public void setErrorCode(int i2) {
        this.errorCode = i2;
    }

    public void setFaceCount(int i2) {
        this.faceCount = i2;
    }

    public void setFaceFeatures(float[] fArr) {
        this.faceFeatures = fArr;
    }

    public void setFaceScore(float f2) {
        this.face_score = f2;
    }

    public void setFeatureByte(byte[] bArr) {
        this.featureByte = bArr;
    }

    public void setQualityScore(float f2) {
        this.quality_score = f2;
    }

    public void setScore(float f2) {
        this.score = f2;
    }

    public void setSharpnessScore(float f2) {
        this.sharpness_score = f2;
    }

    public void setSimilarityScore(float f2) {
        this.similarityScore = f2;
    }
}
