package com.ss.android.ugc.aweme.comment.ui;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.a;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

final /* synthetic */ class bd implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f72565a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f72566b;

    static {
        Covode.recordClassIndex(44713);
    }

    bd(k kVar, Map map) {
        this.f72565a = kVar;
        this.f72566b = map;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        String str;
        int i3;
        k kVar = this.f72565a;
        Map<String, Comment> map = this.f72566b;
        dialogInterface.dismiss();
        if (i2 == 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            String curUserId = b.g().getCurUserId();
            Map<String, Comment> map2 = kVar.I.f72896c;
            map2.clear();
            Iterator<Map.Entry<String, Comment>> it = map.entrySet().iterator();
            int i4 = 0;
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                Comment value = it.next().getValue();
                if (value.getUser() != null) {
                    str = value.getUser().getUid();
                }
                String cid = value.getCid();
                if (!TextUtils.equals(curUserId, str)) {
                    arrayList.add(cid);
                    arrayList2.add(str);
                    hashSet.add(str);
                    map2.put(cid, value);
                }
                if (value.getAliasAweme() != null) {
                    i4++;
                }
            }
            if (map2.size() == 0) {
                new com.bytedance.tux.g.b(kVar).a(kVar.getString(R.string.aka)).b();
                return;
            }
            int size = arrayList.size();
            int size2 = hashSet.size();
            String enterFrom = kVar.f72763b.getEnterFrom();
            l.d(enterFrom, str);
            r.a("comment_batch_management_report_ck", new d().a("c_number", size).a("u_number", size2).a("video_reply_number", i4).a("enter_from", enterFrom).f66730a);
            if (com.ss.android.ugc.aweme.comment.a.b.a().length == 3) {
                i3 = com.ss.android.ugc.aweme.comment.a.b.a()[1];
            } else {
                i3 = 100;
            }
            if (size > i3) {
                new com.bytedance.tux.g.b(kVar).a(kVar.getContext().getResources().getQuantityString(R.plurals.a6, size, Integer.valueOf(size)) + kVar.getContext().getResources().getQuantityString(R.plurals.a7, i3, Integer.valueOf(i3))).b();
            } else if (size > 0) {
                HashSet hashSet2 = new HashSet();
                HashMap hashMap = new HashMap();
                int i5 = 0;
                for (Map.Entry<String, Comment> entry : map2.entrySet()) {
                    String key = entry.getKey();
                    Comment value2 = entry.getValue();
                    if (value2 != null) {
                        if (value2.getCommentType() == 1) {
                            hashSet2.add(key);
                            i5 = (int) (((long) i5) + value2.getReplyCommentTotal() + 1);
                        } else if (value2.getCommentType() == 2) {
                            hashMap.put(key, value2.getReplyId());
                        }
                    }
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    if (!hashSet2.contains(entry2.getValue())) {
                        i5++;
                    }
                }
                kVar.I.f72894a = i5;
                com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(kVar.getContext());
                bVar.a(R.string.akb, new n(kVar, arrayList, arrayList2, size, hashSet, i4));
                bVar.b(R.string.ajz, o.f72806a);
                ((com.bytedance.tux.dialog.b) a.C1094a.a(kVar.requireContext()).b(kVar.getActivity().getResources().getQuantityString(R.plurals.a_, size, Integer.valueOf(size))).d(kVar.getActivity().getResources().getQuantityString(R.plurals.a9, size, Integer.valueOf(size))).a(bVar).a(false)).a().b().show();
                r.onEventV3("comment_batch_management_report_confirm_sw");
            }
        } else {
            kVar.a(map);
        }
    }
}
