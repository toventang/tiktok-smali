package com.bytedance.android.livesdk.container.type;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class HColor implements Serializable {
    private int color;
    private int colorDark;
    private int colorLight;

    static {
        Covode.recordClassIndex(9372);
    }

    public final int getColor() {
        return this.color;
    }

    public final int getColorDark() {
        return this.colorDark;
    }

    public final int getColorLight() {
        return this.colorLight;
    }

    public final void setColor(int i2) {
        this.color = i2;
    }

    public final void setColorDark(int i2) {
        this.colorDark = i2;
    }

    public final void setColorLight(int i2) {
        this.colorLight = i2;
    }

    public final int getColor(Context context) {
        Resources resources;
        Configuration configuration;
        int i2;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return this.color;
        }
        if ((configuration.uiMode & 48) == 32) {
            i2 = this.colorDark;
        } else {
            i2 = this.colorLight;
        }
        if (i2 == 0) {
            return this.color;
        }
        return i2;
    }
}
