package com.bytedance.lynx.a.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.a.a.a.a;
import com.bytedance.lynx.a.a.e.a;
import com.bytedance.lynx.hybrid.a.c;
import h.f.b.g;
import h.f.b.l;

public final class b extends c {
    private String animation;
    private boolean disableMaskClose;
    private boolean dragBack;
    private boolean dragByGesture;
    private int dragDownCloseThreshold;
    private int dragDownThreshold;
    private int dragHeight;
    private int dragUpThreshold;
    private String gravity;
    private int height;
    private a maskBgColor;
    private int peekDownCloseThreshold;
    private boolean pullDownClose;
    private int radius;
    private boolean showMask;
    private int width;

    static {
        Covode.recordClassIndex(25034);
    }

    public b() {
        this(null, 1, null);
    }

    public final String getAnimation() {
        return this.animation;
    }

    public final boolean getDisableMaskClose() {
        return this.disableMaskClose;
    }

    public final boolean getDragBack() {
        return this.dragBack;
    }

    public final boolean getDragByGesture() {
        return this.dragByGesture;
    }

    public final int getDragDownCloseThreshold() {
        return this.dragDownCloseThreshold;
    }

    public final int getDragDownThreshold() {
        return this.dragDownThreshold;
    }

    public final int getDragHeight() {
        return this.dragHeight;
    }

    public final int getDragUpThreshold() {
        return this.dragUpThreshold;
    }

    public final String getGravity() {
        return this.gravity;
    }

    public final int getHeight() {
        return this.height;
    }

    public final a getMaskBgColor() {
        return this.maskBgColor;
    }

    public final int getPeekDownCloseThreshold() {
        return this.peekDownCloseThreshold;
    }

    public final boolean getPullDownClose() {
        return this.pullDownClose;
    }

    public final int getRadius() {
        return this.radius;
    }

    public final boolean getShowMask() {
        return this.showMask;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setDisableMaskClose(boolean z) {
        this.disableMaskClose = z;
    }

    public final void setDragBack(boolean z) {
        this.dragBack = z;
    }

    public final void setDragByGesture(boolean z) {
        this.dragByGesture = z;
    }

    public final void setDragDownCloseThreshold(int i2) {
        this.dragDownCloseThreshold = i2;
    }

    public final void setDragDownThreshold(int i2) {
        this.dragDownThreshold = i2;
    }

    public final void setDragHeight(int i2) {
        this.dragHeight = i2;
    }

    public final void setDragUpThreshold(int i2) {
        this.dragUpThreshold = i2;
    }

    public final void setHeight(int i2) {
        this.height = i2;
    }

    public final void setMaskBgColor(a aVar) {
        this.maskBgColor = aVar;
    }

    public final void setPeekDownCloseThreshold(int i2) {
        this.peekDownCloseThreshold = i2;
    }

    public final void setPullDownClose(boolean z) {
        this.pullDownClose = z;
    }

    public final void setRadius(int i2) {
        this.radius = i2;
    }

    public final void setShowMask(boolean z) {
        this.showMask = z;
    }

    public final void setWidth(int i2) {
        this.width = i2;
    }

    public final void setAnimation(String str) {
        l.c(str, "");
        this.animation = str;
    }

    public final void setGravity(String str) {
        l.c(str, "");
        this.gravity = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(cVar);
        l.c(cVar, "");
        this.gravity = "bottom";
        this.width = a.C0987a.C0988a.f40839a;
        this.height = a.C0987a.C0988a.f40840b;
        this.radius = 8;
        this.animation = "auto";
        this.dragHeight = -1;
        this.dragUpThreshold = a.C0987a.C0988a.f40841c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? c.UNKNOWN : cVar);
    }
}
