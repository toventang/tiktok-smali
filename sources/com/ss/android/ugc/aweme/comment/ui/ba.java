package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.a;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.comment.a.b;
import com.ss.android.ugc.aweme.comment.a.f;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ba implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f72562a;

    static {
        Covode.recordClassIndex(44710);
    }

    ba(k kVar) {
        this.f72562a = kVar;
    }

    public final void onClick(View view) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        ClickAgent.onClick(view);
        k kVar = this.f72562a;
        if (kVar.I != null) {
            Map<String, Comment> map = kVar.I.f72895b;
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            HashMap hashMap = new HashMap();
            int i6 = 0;
            int i7 = 0;
            for (Map.Entry<String, Comment> entry : map.entrySet()) {
                String key = entry.getKey();
                Comment value = entry.getValue();
                if (value != null) {
                    if (value.getCommentType() == 1) {
                        hashSet3.add(key);
                        i6 = (int) (((long) i6) + value.getReplyCommentTotal() + 1);
                    } else if (value.getCommentType() == 2) {
                        hashMap.put(key, value.getReplyId());
                    }
                    if (value.getUser() != null) {
                        hashSet2.add(value.getUser().getUid());
                    }
                    if (value.getAliasAweme() != null) {
                        i7++;
                    }
                }
            }
            if (hashSet3.size() > 0) {
                hashSet.addAll(hashSet3);
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (!hashSet3.contains(entry2.getValue())) {
                    hashSet.add(entry2.getKey());
                    i6++;
                }
            }
            int size = map.size();
            int size2 = hashSet2.size();
            String enterFrom = kVar.f72763b.getEnterFrom();
            l.d(enterFrom, "");
            r.a("comment_batch_management_delete_ck", new d().a("c_number", size).a("u_number", size2).a("video_reply_number", i7).a("enter_from", enterFrom).f66730a);
            if (b.a().length == 3) {
                i2 = b.a()[0];
            } else {
                i2 = 100;
            }
            if (size > i2) {
                new com.bytedance.tux.g.b(kVar).a(kVar.getContext().getResources().getQuantityString(R.plurals.a6, size, Integer.valueOf(size)) + kVar.getContext().getResources().getQuantityString(R.plurals.a7, i2, Integer.valueOf(i2))).b();
            } else if (hashSet.size() > 0 && kVar.f72764c != null) {
                com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(kVar.getContext());
                kVar.I.f72894a = i6;
                if (size == 1 && i7 == 1) {
                    z = true;
                    i3 = R.string.alz;
                } else {
                    z = false;
                    i3 = R.string.ak0;
                }
                bVar.a(i3, new r(kVar, hashSet, size, hashSet2, i7));
                bVar.b(R.string.ajz, new s(kVar));
                if (i7 <= 0 || !f.a()) {
                    ((com.bytedance.tux.dialog.b) a.C1094a.a(kVar.requireContext()).b(kVar.getActivity().getResources().getQuantityString(R.plurals.a4, size, Integer.valueOf(size))).d(kVar.getActivity().getResources().getQuantityString(R.plurals.a3, size, Integer.valueOf(size))).a(bVar).a(false)).a().b().show();
                } else {
                    if (z) {
                        i4 = R.string.am1;
                        i5 = R.string.am0;
                    } else {
                        i4 = R.string.alw;
                        i5 = R.string.alv;
                    }
                    ((com.bytedance.tux.dialog.b) ((com.bytedance.tux.dialog.b) a.C1094a.a(kVar.requireContext()).a(i4)).d(kVar.getActivity().getResources().getString(i5)).a(bVar).a(false)).a().b().show();
                }
                String enterFrom2 = kVar.f72763b.getEnterFrom();
                l.d(enterFrom2, "");
                r.a("comment_batch_management_delete_confirm_sw", new d().a("enter_from", enterFrom2).f66730a);
            }
        }
    }
}
