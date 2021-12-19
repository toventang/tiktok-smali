package com.ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.google.c.a.i;
import java.io.Serializable;
import java.util.Arrays;

public class EffectModel implements Serializable {
    public String adjustParams;
    public String category;
    public int color;
    public int duration;
    public String extra;
    public String hint;
    public String iconUrl;
    public int imagePath;
    public boolean isEnabled = true;
    public Boolean isNewEngineEffect = false;
    public String key;
    public String name;
    public String resDir;
    public int type;

    static {
        Covode.recordClassIndex(55832);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.name, this.hint, Integer.valueOf(this.imagePath), this.key, Integer.valueOf(this.type), this.iconUrl, this.resDir, Integer.valueOf(this.color), Integer.valueOf(this.duration), this.category, this.extra, Boolean.valueOf(this.isEnabled)});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EffectModel effectModel = (EffectModel) obj;
            if (this.imagePath != effectModel.imagePath || this.type != effectModel.type || this.color != effectModel.color || this.duration != effectModel.duration || this.isEnabled != effectModel.isEnabled || !i.a(this.name, effectModel.name) || !i.a(this.hint, effectModel.hint) || !i.a(this.key, effectModel.key) || !i.a(this.iconUrl, effectModel.iconUrl) || !i.a(this.resDir, effectModel.resDir) || !i.a(this.category, effectModel.category) || !i.a(this.extra, effectModel.extra)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
