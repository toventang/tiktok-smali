package com.ss.android.ugc.aweme.friends.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements SwipeRefreshLayout.b {

    /* renamed from: a  reason: collision with root package name */
    private final ContactsActivity f97263a;

    static {
        Covode.recordClassIndex(61791);
    }

    o(ContactsActivity contactsActivity) {
        this.f97263a = contactsActivity;
    }

    @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.b
    public final void a() {
        ContactsActivity contactsActivity = this.f97263a;
        if (contactsActivity.f97062j != null) {
            contactsActivity.f97062j.a(1);
            return;
        }
        contactsActivity.f97056d.setRefreshing(false);
    }
}
