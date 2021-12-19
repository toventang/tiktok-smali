package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.p;
import com.a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class g extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public h f1205a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1206b;

    /* renamed from: c  reason: collision with root package name */
    private int f1207c = -1;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1208d;

    /* renamed from: e  reason: collision with root package name */
    private final LayoutInflater f1209e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1210f;

    static {
        Covode.recordClassIndex(338);
    }

    public final long getItemId(int i2) {
        return (long) i2;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }

    private void a() {
        j jVar = this.f1205a.f1222l;
        if (jVar != null) {
            ArrayList<j> k2 = this.f1205a.k();
            int size = k2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (k2.get(i2) == jVar) {
                    this.f1207c = i2;
                    return;
                }
            }
        }
        this.f1207c = -1;
    }

    public final int getCount() {
        ArrayList<j> i2;
        if (this.f1208d) {
            i2 = this.f1205a.k();
        } else {
            i2 = this.f1205a.i();
        }
        if (this.f1207c < 0) {
            return i2.size();
        }
        return i2.size() - 1;
    }

    /* renamed from: a */
    public final j getItem(int i2) {
        ArrayList<j> i3;
        if (this.f1208d) {
            i3 = this.f1205a.k();
        } else {
            i3 = this.f1205a.i();
        }
        int i4 = this.f1207c;
        if (i4 >= 0 && i2 >= i4) {
            i2++;
        }
        return i3.get(i2);
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        int i3;
        boolean z = false;
        if (view == null) {
            view = a.a(this.f1209e, this.f1210f, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i4 = i2 - 1;
        if (i4 >= 0) {
            i3 = getItem(i4).getGroupId();
        } else {
            i3 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f1205a.b() && groupId != i3) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        p.a aVar = (p.a) view;
        if (this.f1206b) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.a(getItem(i2));
        return view;
    }

    public g(h hVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f1208d = z;
        this.f1209e = layoutInflater;
        this.f1205a = hVar;
        this.f1210f = i2;
        a();
    }
}
