package com.lynx.tasm.behavior.shadow.text;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.a.a;
import java.util.HashMap;
import java.util.Map;

public class f extends ClickableSpan implements a {

    /* renamed from: a  reason: collision with root package name */
    public a f56000a;

    /* renamed from: b  reason: collision with root package name */
    private int f56001b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, com.lynx.tasm.c.a> f56002c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f56003d;

    static {
        Covode.recordClassIndex(34998);
    }

    @Override // com.lynx.tasm.behavior.a.a
    public boolean blockNativeEvent() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.a.a
    public boolean isFocusable() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.a.a
    public void offResponseChain() {
    }

    public void onClick(View view) {
    }

    @Override // com.lynx.tasm.behavior.a.a
    public void onFocusChanged(boolean z, boolean z2) {
    }

    @Override // com.lynx.tasm.behavior.a.a
    public void onResponseChain() {
    }

    public void updateDrawState(TextPaint textPaint) {
    }

    @Override // com.lynx.tasm.behavior.a.a
    public Map<String, com.lynx.tasm.c.a> getEvents() {
        return this.f56002c;
    }

    @Override // com.lynx.tasm.behavior.a.a
    public int getSign() {
        return this.f56001b;
    }

    @Override // com.lynx.tasm.behavior.a.a
    public boolean ignoreFocus() {
        return this.f56003d;
    }

    @Override // com.lynx.tasm.behavior.a.a
    public a parent() {
        return this.f56000a;
    }

    public f(int i2, Map<String, com.lynx.tasm.c.a> map, boolean z) {
        this.f56001b = i2;
        this.f56003d = z;
        if (map != null) {
            HashMap hashMap = new HashMap();
            this.f56002c = hashMap;
            hashMap.putAll(map);
            return;
        }
        this.f56002c = null;
    }
}
