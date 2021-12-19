package com.ss.android.ugc.aweme.search.g;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

public final class b implements Serializable {
    private List<h> activitySwitchOption;
    private int filterBy;
    private g filterByStruct;
    private boolean isDefaultOption = true;
    private boolean isFromSchema;
    private int sortType;
    private g sortTypeStruct;

    static {
        Covode.recordClassIndex(78899);
    }

    public final List<h> getActivitySwitchOption() {
        return this.activitySwitchOption;
    }

    public final int getFilterBy() {
        return this.filterBy;
    }

    public final g getFilterByStruct() {
        return this.filterByStruct;
    }

    public final int getSortType() {
        return this.sortType;
    }

    public final g getSortTypeStruct() {
        return this.sortTypeStruct;
    }

    public final boolean isDefaultOption() {
        return this.isDefaultOption;
    }

    public final boolean isFromSchema() {
        return this.isFromSchema;
    }

    public final LinkedHashMap<String, Integer> activityToFieldMap() {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        List<h> list = this.activitySwitchOption;
        if (list != null) {
            for (T t : list) {
                String requestKey = t.getRequestKey();
                if (requestKey == null) {
                    requestKey = "";
                }
                linkedHashMap.put(requestKey, Integer.valueOf(t.isSelected() ? 1 : 0));
            }
        }
        return linkedHashMap;
    }

    public final void setActivitySwitchOption(List<h> list) {
        this.activitySwitchOption = list;
    }

    public final void setDefaultOption(boolean z) {
        this.isDefaultOption = z;
    }

    public final void setFilterBy(int i2) {
        this.filterBy = i2;
    }

    public final void setFilterByStruct(g gVar) {
        this.filterByStruct = gVar;
    }

    public final void setFromSchema(boolean z) {
        this.isFromSchema = z;
    }

    public final void setSortType(int i2) {
        this.sortType = i2;
    }

    public final void setSortTypeStruct(g gVar) {
        this.sortTypeStruct = gVar;
    }
}
