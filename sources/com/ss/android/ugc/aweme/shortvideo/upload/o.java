package com.ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.et;
import com.ss.android.ugc.aweme.shortvideo.x;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;

public final class o extends ArrayList<x<ai>> implements x<ai> {
    static {
        Covode.recordClassIndex(86547);
    }

    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onParallelPublishCancel() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((x) it.next()).onParallelPublishCancel();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onParallelPublishPause() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((x) it.next()).onParallelPublishPause();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onParallelPublishResume() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((x) it.next()).onParallelPublishResume();
        }
    }

    public final /* bridge */ boolean contains(x xVar) {
        return super.contains((Object) xVar);
    }

    public final /* bridge */ int indexOf(x xVar) {
        return super.indexOf((Object) xVar);
    }

    public final /* bridge */ int lastIndexOf(x xVar) {
        return super.lastIndexOf((Object) xVar);
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public final x<ai> remove(int i2) {
        return removeAt(i2);
    }

    public final x removeAt(int i2) {
        return (x) super.remove(i2);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        return contains((x) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof x)) {
            return -1;
        }
        return indexOf((x) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof x)) {
            return -1;
        }
        return lastIndexOf((x) obj);
    }

    public final /* bridge */ boolean remove(x xVar) {
        return super.remove((Object) xVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onError(et etVar) {
        l.d(etVar, "");
        Iterator it = iterator();
        while (it.hasNext()) {
            ((x) it.next()).onError(etVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onSynthetiseSuccess(String str) {
        l.d(str, "");
        Iterator it = iterator();
        while (it.hasNext()) {
            ((x) it.next()).onSynthetiseSuccess(str);
        }
    }

    @Override // java.util.List, java.util.ArrayList
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        return remove((x) obj);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onProgressUpdate(int i2, boolean z) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((x) it.next()).onProgressUpdate(i2, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onSuccess(ai aiVar, boolean z) {
        l.d(aiVar, "");
        Iterator it = iterator();
        while (it.hasNext()) {
            ((x) it.next()).onSuccess(aiVar, z);
        }
    }
}
