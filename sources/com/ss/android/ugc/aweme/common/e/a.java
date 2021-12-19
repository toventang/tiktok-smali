package com.ss.android.ugc.aweme.common.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class a<T, K> extends b<K> {
    public int mCount;
    public boolean mIsNewDataEmpty;
    public e mListAdapter;
    public int mListQueryType = 1;

    static {
        Covode.recordClassIndex(47163);
    }

    public abstract List<T> getItems();

    public abstract boolean isHasMore();

    /* access modifiers changed from: protected */
    public void loadLatestList(Object... objArr) {
    }

    /* access modifiers changed from: protected */
    public abstract void loadMoreList(Object... objArr);

    /* access modifiers changed from: protected */
    public boolean needCheckEmptyForQueryType() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void refreshList(Object... objArr);

    public void setItems(List<T> list) {
    }

    public boolean isNewDataEmpty() {
        return this.mIsNewDataEmpty;
    }

    /* access modifiers changed from: protected */
    public int getCurrentIndex() {
        e eVar = this.mListAdapter;
        if (eVar != null) {
            return eVar.a();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getListCount() {
        e eVar = this.mListAdapter;
        if (eVar != null) {
            return eVar.b();
        }
        return -1;
    }

    public boolean isDataEmpty() {
        return com.bytedance.common.utility.collection.b.a((Collection) getItems());
    }

    public boolean insertItem(T t) {
        int size;
        List<T> items = getItems();
        if (items == null) {
            size = 0;
        } else {
            size = items.size();
        }
        return insertItem(t, size);
    }

    public boolean deleteItem(T t) {
        List<T> items = getItems();
        if (com.bytedance.common.utility.collection.b.a((Collection) items)) {
            return false;
        }
        int indexOf = items.indexOf(t);
        boolean remove = items.remove(t);
        if (indexOf >= 0) {
            for (o oVar : this.mNotifyListeners) {
                if (oVar != null && (oVar instanceof f)) {
                    ((f) oVar).a(indexOf);
                }
            }
        }
        return remove;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        if (!needCheckEmptyForQueryType() || !isDataEmpty()) {
            this.mListQueryType = ((Integer) objArr[0]).intValue();
        } else {
            this.mListQueryType = 1;
        }
        int i2 = this.mListQueryType;
        if (i2 == 1) {
            refreshList(objArr);
        } else if (i2 == 2) {
            loadLatestList(objArr);
        } else if (i2 == 4) {
            loadMoreList(objArr);
        }
        return true;
    }

    public boolean insertItem(T t, int i2) {
        List<T> items = getItems();
        if (com.bytedance.common.utility.collection.b.a((Collection) items)) {
            items = new ArrayList<>();
        }
        if (i2 < 0 || i2 > items.size()) {
            return false;
        }
        items.add(i2, t);
        if (items.size() == 1) {
            setItems(items);
        }
        for (o oVar : this.mNotifyListeners) {
            if (oVar != null && (oVar instanceof f)) {
                ((f) oVar).a(items, i2);
            }
        }
        return true;
    }

    public boolean insertItemList(List<T> list, int i2) {
        List<T> items = getItems();
        if (com.bytedance.common.utility.collection.b.a((Collection) items)) {
            items = new ArrayList<>();
        }
        if (i2 < 0 || i2 > items.size()) {
            return false;
        }
        items.addAll(i2, list);
        if (items.size() == 1) {
            setItems(items);
        }
        for (o oVar : this.mNotifyListeners) {
            if (oVar != null && (oVar instanceof f)) {
                ((f) oVar).a(items, i2);
            }
        }
        return true;
    }
}
