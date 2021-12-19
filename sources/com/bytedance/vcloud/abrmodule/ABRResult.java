package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class ABRResult {
    private List<ABRResultElement> elements = new ArrayList();

    static {
        Covode.recordClassIndex(28003);
    }

    public int size() {
        return this.elements.size();
    }

    public void add(ABRResultElement aBRResultElement) {
        this.elements.add(aBRResultElement);
    }

    public ABRResultElement get(int i2) {
        return this.elements.get(i2);
    }
}
