package com.ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import java.util.List;

public class ComposerNode {
    public String UI_name;
    public List<ComposerNode> children;
    public float default_value;
    public Effect effect;
    public String file;
    public String icon;
    public float max_value;
    public float min_value;
    public ComposerNode parent;
    public int switch_mode;
    public String tag_name;
    public int type;

    static {
        Covode.recordClassIndex(95397);
    }

    public boolean isLeaf() {
        int i2 = this.type;
        if (i2 == 4 || i2 == 1) {
            return false;
        }
        return true;
    }
}
