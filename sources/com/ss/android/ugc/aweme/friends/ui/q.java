package com.ss.android.ugc.aweme.friends.ui;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.widget.IndexView;

final /* synthetic */ class q implements IndexView.a {

    /* renamed from: a  reason: collision with root package name */
    private final ContactsActivity f97265a;

    /* renamed from: b  reason: collision with root package name */
    private final int f97266b;

    static {
        Covode.recordClassIndex(61793);
    }

    q(ContactsActivity contactsActivity, int i2) {
        this.f97265a = contactsActivity;
        this.f97266b = i2;
    }

    @Override // com.ss.android.ugc.aweme.friends.widget.IndexView.a
    public final void a(int i2) {
        ContactsActivity contactsActivity = this.f97265a;
        int i3 = this.f97266b;
        LinearLayoutManager linearLayoutManager = contactsActivity.n;
        IndexView indexView = contactsActivity.f97059g;
        int i4 = 0;
        int i5 = 0;
        while (i4 < indexView.f97291b.size() && i4 < i2) {
            i5 += indexView.f97291b.get(i4).intValue();
            i4++;
        }
        linearLayoutManager.a(i5 + i3, 0);
    }
}
