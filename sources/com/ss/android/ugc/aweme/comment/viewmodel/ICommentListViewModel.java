package com.ss.android.ugc.aweme.comment.viewmodel;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class ICommentListViewModel extends DataCenter {

    /* renamed from: e  reason: collision with root package name */
    public static final a f72922e = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public Map<String, CommentItemList> f72923d = new LinkedHashMap();

    static {
        Covode.recordClassIndex(44924);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44925);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
