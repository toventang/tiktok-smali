package com.ss.android.ugc.aweme.search;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.discover.model.Position;
import java.io.Serializable;
import java.util.List;

public final class d implements Serializable {
    @c(a = "field")
    private String field;
    @c(a = "positions")
    private List<Position> positions;

    static {
        Covode.recordClassIndex(78817);
    }

    public final String getField() {
        return this.field;
    }

    public final List<Position> getPositions() {
        return this.positions;
    }

    public final void setField(String str) {
        this.field = str;
    }

    public final void setPositions(List<Position> list) {
        this.positions = list;
    }
}
