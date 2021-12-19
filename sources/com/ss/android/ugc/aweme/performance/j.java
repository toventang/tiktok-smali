package com.ss.android.ugc.aweme.performance;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.b.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import f.a.t;
import f.a.v;
import f.a.w;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public enum j {
    INSTANCE;
    
    public a asyncLayoutInflater = new a(d.a());
    public ConcurrentHashMap<Integer, LinkedList<View>> storage = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(73858);
    }

    public final void setContext(Context context) {
        this.asyncLayoutInflater = new a(context);
    }

    private j(String str) {
    }

    public final void recycle(int i2, View view) {
        LinkedList<View> linkedList = this.storage.get(Integer.valueOf(i2));
        if (linkedList != null) {
            linkedList.add(view);
        }
    }

    public final t<View> preInflate(final int i2, final ViewGroup viewGroup) {
        LinkedList<View> linkedList = this.storage.get(Integer.valueOf(i2));
        if (linkedList == null || linkedList.isEmpty()) {
            return t.a(new w<View>() {
                /* class com.ss.android.ugc.aweme.performance.j.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(73859);
                }

                @Override // f.a.w
                public final void subscribe(final v<View> vVar) {
                    j.this.asyncLayoutInflater.a(i2, viewGroup, new a.d() {
                        /* class com.ss.android.ugc.aweme.performance.j.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(73860);
                        }

                        @Override // androidx.b.a.a.d
                        public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
                            vVar.a(view);
                            LinkedList<View> linkedList = j.this.storage.get(Integer.valueOf(i2));
                            if (linkedList == null) {
                                linkedList = new LinkedList<>();
                                j.this.storage.put(Integer.valueOf(i2), linkedList);
                            }
                            linkedList.add(view);
                        }
                    });
                }
            });
        }
        return f.a.h.a.a(f.a.e.e.e.v.f157740a);
    }

    public final View inflate(Context context, int i2, ViewGroup viewGroup) {
        return inflate(LayoutInflater.from(context), context, i2, viewGroup);
    }

    public final View inflate(LayoutInflater layoutInflater, Context context, int i2, ViewGroup viewGroup) {
        LinkedList<View> linkedList = this.storage.get(Integer.valueOf(i2));
        if (linkedList == null || linkedList.isEmpty()) {
            return com.a.a(layoutInflater, i2, viewGroup, false);
        }
        View poll = linkedList.poll();
        Context context2 = poll.getContext();
        if (context2 instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context2).setBaseContext(context);
        }
        return poll;
    }
}
