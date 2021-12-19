package com.zhihu.matisse.internal.b;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.R;
import com.zhihu.matisse.a.a;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.entity.b;
import com.zhihu.matisse.internal.entity.c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public Set<Item> f156408a;

    /* renamed from: b  reason: collision with root package name */
    public int f156409b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f156410c;

    static {
        Covode.recordClassIndex(103880);
    }

    public final List<Item> b() {
        return new ArrayList(this.f156408a);
    }

    public final int e() {
        return this.f156408a.size();
    }

    public final boolean d() {
        if (this.f156408a.size() == f()) {
            return true;
        }
        return false;
    }

    private int f() {
        com.zhihu.matisse.internal.entity.c cVar = c.a.f156445a;
        if (cVar.f156438g > 0) {
            return cVar.f156438g;
        }
        int i2 = this.f156409b;
        if (i2 == 1) {
            return cVar.f156439h;
        }
        if (i2 == 2) {
            return cVar.f156440i;
        }
        return cVar.f156438g;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("state_selection", new ArrayList<>(this.f156408a));
        bundle.putInt("state_collection_type", this.f156409b);
        return bundle;
    }

    public final List<Uri> c() {
        ArrayList arrayList = new ArrayList();
        for (Item item : this.f156408a) {
            arrayList.add(item.f156423c);
        }
        return arrayList;
    }

    public c(Context context) {
        this.f156410c = context;
    }

    public final boolean c(Item item) {
        return this.f156408a.contains(item);
    }

    public final void b(Bundle bundle) {
        bundle.putParcelableArrayList("state_selection", new ArrayList<>(this.f156408a));
        bundle.putInt("state_collection_type", this.f156409b);
    }

    public final int e(Item item) {
        int indexOf = new ArrayList(this.f156408a).indexOf(item);
        if (indexOf == -1) {
            return Integer.MIN_VALUE;
        }
        return indexOf + 1;
    }

    private boolean f(Item item) {
        int i2;
        if (!c.a.f156445a.f156433b) {
            return false;
        }
        if (!item.a() || !((i2 = this.f156409b) == 2 || i2 == 3)) {
            if (!item.c()) {
                return false;
            }
            int i3 = this.f156409b;
            if (i3 == 1 || i3 == 3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            this.f156408a = new LinkedHashSet();
            return;
        }
        this.f156408a = new LinkedHashSet(bundle.getParcelableArrayList("state_selection"));
        this.f156409b = bundle.getInt("state_collection_type", 0);
    }

    public final boolean a(Item item) {
        if (!f(item)) {
            boolean add = this.f156408a.add(item);
            if (add) {
                int i2 = this.f156409b;
                if (i2 == 0) {
                    if (item.a()) {
                        this.f156409b = 1;
                    } else if (item.c()) {
                        this.f156409b = 2;
                    }
                } else if (i2 == 1) {
                    if (item.c()) {
                        this.f156409b = 3;
                    }
                } else if (i2 == 2 && item.a()) {
                    this.f156409b = 3;
                }
            }
            return add;
        }
        throw new IllegalArgumentException("Can't select images and videos at the same time.");
    }

    public final boolean b(Item item) {
        boolean remove = this.f156408a.remove(item);
        if (remove) {
            boolean z = false;
            if (this.f156408a.size() == 0) {
                this.f156409b = 0;
            } else if (this.f156409b == 3) {
                boolean z2 = false;
                for (Item item2 : this.f156408a) {
                    if (item2.a() && !z) {
                        z = true;
                    }
                    if (item2.c() && !z2) {
                        z2 = true;
                    }
                }
                if (z) {
                    if (z2) {
                        this.f156409b = 3;
                    } else {
                        this.f156409b = 1;
                    }
                } else if (z2) {
                    this.f156409b = 2;
                }
            }
        }
        return remove;
    }

    public final b d(Item item) {
        String str;
        if (d()) {
            int f2 = f();
            try {
                str = this.f156410c.getResources().getQuantityString(R.plurals.matisse_error_over_count, f2, Integer.valueOf(f2));
            } catch (Resources.NotFoundException unused) {
                str = this.f156410c.getString(com.zhiliaoapp.musically.R.string.d2o, Integer.valueOf(f2));
            } catch (NoClassDefFoundError unused2) {
                str = this.f156410c.getString(com.zhiliaoapp.musically.R.string.d2o, Integer.valueOf(f2));
            }
            return new b(str);
        } else if (f(item)) {
            return new b(this.f156410c.getString(com.zhiliaoapp.musically.R.string.d2t));
        } else {
            Context context = this.f156410c;
            if (context != null) {
                ContentResolver contentResolver = context.getContentResolver();
                for (com.zhihu.matisse.b bVar : c.a.f156445a.f156432a) {
                    if (bVar.checkType(context, contentResolver, item.f156423c)) {
                        if (c.a.f156445a.f156441j == null) {
                            return null;
                        }
                        for (a aVar : c.a.f156445a.f156441j) {
                            b a2 = aVar.a(context, item);
                            if (a2 != null) {
                                return a2;
                            }
                        }
                        return null;
                    }
                }
            }
            return new b(context.getString(com.zhiliaoapp.musically.R.string.d2m));
        }
    }
}
