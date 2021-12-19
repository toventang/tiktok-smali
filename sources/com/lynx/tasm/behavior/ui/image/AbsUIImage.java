package com.lynx.tasm.behavior.ui.image;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.v;

public abstract class AbsUIImage<T extends View> extends LynxUI<T> {
    static {
        Covode.recordClassIndex(35096);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            boolean z2 = false;
            int i2 = 0;
            boolean z3 = false;
            switch (nextKey.hashCode()) {
                case -1937917490:
                    if (nextKey.equals("cap-insets-scale")) {
                        setCapInsetsScale(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1249491252:
                    if (nextKey.equals("cover-start")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setCoverStart(z);
                        continue;
                    }
                    break;
                case -934531685:
                    if (nextKey.equals("repeat")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setRepeat(z3);
                        continue;
                    }
                    break;
                case -629825370:
                    if (nextKey.equals("loop-count")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setLoopCount(i2);
                        continue;
                    }
                    break;
                case -256430480:
                    if (nextKey.equals("prefetch-width")) {
                        setPreFetchWidth(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 114148:
                    if (nextKey.equals("src")) {
                        setSource(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3357091:
                    if (nextKey.equals("mode")) {
                        setObjectFit(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 207594941:
                    if (nextKey.equals("prefetch-height")) {
                        setPreFetchHeight(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 516005201:
                    if (nextKey.equals("cap-insets")) {
                        setCapInsetsBackUp(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 598246771:
                    if (nextKey.equals("placeholder")) {
                        setPlaceholder(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 681292984:
                    if (nextKey.equals("blur-radius")) {
                        setBlurRadius(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1198809474:
                    if (nextKey.equals("disable-default-placeholder")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        setDisableDefaultPlaceholder(z2);
                        continue;
                    }
                    break;
                case 1515751784:
                    if (nextKey.equals("capInsets")) {
                        setCapInsets(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @m(a = "blur-radius")
    public abstract void setBlurRadius(String str);

    @m(a = "capInsets")
    public abstract void setCapInsets(String str);

    @m(a = "cap-insets")
    public void setCapInsetsBackUp(String str) {
    }

    @m(a = "cap-insets-scale")
    public void setCapInsetsScale(String str) {
    }

    @m(a = "cover-start", f = false)
    public abstract void setCoverStart(boolean z);

    @m(a = "disable-default-placeholder", f = false)
    public void setDisableDefaultPlaceholder(boolean z) {
    }

    @m(a = "loop-count")
    public abstract void setLoopCount(int i2);

    @m(a = "mode")
    public abstract void setObjectFit(String str);

    @m(a = "placeholder")
    public abstract void setPlaceholder(String str);

    @m(a = "prefetch-height")
    public abstract void setPreFetchHeight(String str);

    @m(a = "prefetch-width")
    public abstract void setPreFetchWidth(String str);

    @m(a = "repeat", f = false)
    public abstract void setRepeat(boolean z);

    @m(a = "src")
    public abstract void setSource(String str);

    public AbsUIImage(j jVar) {
        super(jVar);
    }
}
