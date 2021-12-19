package com.ss.android.ugc.aweme.friends.a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.widget.g;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.friends.a.f;
import com.ss.android.ugc.aweme.friends.model.ContactModel;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class j<T extends User> extends g<T> implements SectionIndexer {

    /* renamed from: d  reason: collision with root package name */
    public boolean f96786d;

    /* renamed from: e  reason: collision with root package name */
    public int f96787e;

    /* renamed from: f  reason: collision with root package name */
    private SectionIndexer f96788f;

    /* renamed from: g  reason: collision with root package name */
    private b f96789g;

    /* renamed from: h  reason: collision with root package name */
    private int f96790h;

    /* renamed from: i  reason: collision with root package name */
    private String f96791i;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.ugc.aweme.friends.c.b f96792j;

    /* renamed from: k  reason: collision with root package name */
    private f.a f96793k;
    private View w;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f96794a = -1;

        /* renamed from: b  reason: collision with root package name */
        public boolean f96795b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f96796c;

        /* renamed from: d  reason: collision with root package name */
        public String f96797d;

        static {
            Covode.recordClassIndex(61414);
        }
    }

    static {
        Covode.recordClassIndex(61412);
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final View b() {
        return this.w;
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final boolean d() {
        if (this.w != null) {
            return true;
        }
        return false;
    }

    public final Object[] getSections() {
        SectionIndexer sectionIndexer = this.f96788f;
        if (sectionIndexer != null) {
            return sectionIndexer.getSections();
        }
        return new String[]{" "};
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g, com.ss.android.ugc.aweme.common.a.f
    public final int c() {
        int i2;
        int i3 = 0;
        if (this.w == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (this.f76354l != null) {
            i3 = this.f76354l.size();
        }
        return i2 + i3;
    }

    static class a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(61413);
        }

        a(View view) {
            super(view);
        }
    }

    public final void a(SectionIndexer sectionIndexer) {
        this.f96788f = sectionIndexer;
        this.f96789g.f96794a = -1;
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final void a(View view) {
        if (view != null) {
            this.w = view;
            notifyItemInserted(0);
        }
    }

    public final int getPositionForSection(int i2) {
        SectionIndexer sectionIndexer = this.f96788f;
        if (sectionIndexer != null) {
            return sectionIndexer.getPositionForSection(i2);
        }
        return -1;
    }

    public final int getSectionForPosition(int i2) {
        SectionIndexer sectionIndexer = this.f96788f;
        if (sectionIndexer != null) {
            return sectionIndexer.getSectionForPosition(i2);
        }
        return -1;
    }

    private T a(int i2) {
        if (this.w != null) {
            i2--;
        }
        if (i2 == -1 || i2 >= this.f76354l.size()) {
            return null;
        }
        return (T) ((User) this.f76354l.get(i2));
    }

    public j(com.ss.android.ugc.aweme.friends.c.b bVar) {
        this.f96789g = new b();
        this.f96790h = 0;
        this.f96792j = bVar;
        k();
    }

    public final int a(ContactModel contactModel) {
        Friend friend;
        int size = this.f76354l.size();
        for (int i2 = 0; i2 < size; i2++) {
            if ((this.f76354l.get(i2) instanceof Friend) && (friend = (Friend) this.f76354l.get(i2)) != null && contactModel.equals(new ContactModel(friend.getSocialName(), friend.getNickname()))) {
                return i2;
            }
        }
        return -1;
    }

    public final int b(String str) {
        if (c() == 0) {
            return -1;
        }
        int size = this.f76354l.size();
        for (int i2 = 0; i2 < size; i2++) {
            User user = (User) this.f76354l.get(i2);
            if (user != null && TextUtils.equals(user.getUid(), str)) {
                if (d()) {
                    return i2 + 1;
                } else {
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<T> list) {
        if (list == null || !this.f96786d || this.f96790h != 0) {
            super.b_(list);
            return;
        }
        int size = list.size();
        int i2 = this.f96787e;
        if (size - i2 > 0) {
            list.add(i2, null);
        }
        if (this.f96787e > 0) {
            list.add(0, null);
        }
        this.f76354l = list;
        notifyDataSetChanged();
    }

    public final int a(String str) {
        if (c() == 0) {
            return -1;
        }
        int size = this.f76354l.size();
        for (int i2 = 0; i2 < size; i2++) {
            User user = (User) this.f76354l.get(i2);
            if (user != null && TextUtils.equals(user.getUid(), str)) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002a A[RETURN] */
    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.f96786d
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x002b
            int r0 = r5.f96790h
            if (r0 != 0) goto L_0x002b
            int r2 = r5.f96787e
            r1 = 4
            if (r2 <= 0) goto L_0x001f
            if (r6 != 0) goto L_0x0013
            r0 = 3
            return r0
        L_0x0013:
            int r0 = r2 + 1
            if (r6 != r0) goto L_0x0018
            return r1
        L_0x0018:
            if (r6 <= 0) goto L_0x002a
            int r2 = r2 + r3
            if (r6 >= r2) goto L_0x002a
            r0 = 5
            return r0
        L_0x001f:
            java.util.List r0 = r5.f76354l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x002a
            if (r6 != 0) goto L_0x002a
            return r1
        L_0x002a:
            return r4
        L_0x002b:
            android.view.View r0 = r5.w
            if (r0 == 0) goto L_0x0034
            if (r6 != 0) goto L_0x0034
            r0 = 101(0x65, float:1.42E-43)
            return r0
        L_0x0034:
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.a(r6)
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.friends.model.FacebookFriends
            if (r0 == 0) goto L_0x004c
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.a(r6)
            com.ss.android.ugc.aweme.friends.model.FacebookFriends r0 = (com.ss.android.ugc.aweme.friends.model.FacebookFriends) r0
            int r0 = r0.getType()
            if (r0 != r3) goto L_0x004a
            r0 = 6
            return r0
        L_0x004a:
            r0 = 7
            return r0
        L_0x004c:
            boolean r0 = r5.f96786d
            if (r0 == 0) goto L_0x0051
            return r4
        L_0x0051:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.a.j.c(int):int");
    }

    public final void a(FollowStatus followStatus) {
        User user;
        int a2 = a(followStatus.userId);
        if (a2 != -1 && a2 < this.f76354l.size() && (user = (User) this.f76354l.get(a2)) != null) {
            user.setFollowStatus(followStatus.followStatus);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (getItemViewType(i2) != f68516b) {
            if (!(this.w == null || i2 == 0)) {
                i2--;
            }
            b(viewHolder, i2);
        } else if (viewHolder instanceof h.c) {
            ((h.c) viewHolder).a();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup, int i2) {
        View view;
        boolean z;
        if (i2 == 101) {
            return new a(this.w);
        }
        if (i2 == 3 || i2 == 4) {
            return new q(viewGroup);
        }
        if (i2 == 6) {
            return new g(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2d, viewGroup, false));
        }
        if (i2 == 7) {
            return new f(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2c, viewGroup, false), this.f96793k);
        }
        if (i2 == 2 || i2 == 5) {
            view = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2j, viewGroup, false);
        } else {
            view = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2g, viewGroup, false);
        }
        com.ss.android.ugc.aweme.friends.c.b bVar = this.f96792j;
        if (this.f96790h != 0) {
            z = true;
        } else {
            z = false;
        }
        return new k(view, bVar, z, this.f96786d, this.f96791i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x027c, code lost:
        if (c(0) == 4) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    @Override // com.ss.android.ugc.aweme.base.widget.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.recyclerview.widget.RecyclerView.ViewHolder r12, int r13) {
        /*
        // Method dump skipped, instructions count: 743
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.a.j.b(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public j(int i2, String str, com.ss.android.ugc.aweme.friends.c.b bVar, f.a aVar) {
        this.f96789g = new b();
        this.f96790h = i2;
        this.f96791i = str;
        this.f96792j = bVar;
        this.f96793k = aVar;
        k();
    }
}
