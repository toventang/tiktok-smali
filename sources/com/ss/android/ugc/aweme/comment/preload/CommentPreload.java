package com.ss.android.ugc.aweme.comment.preload;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.b.c;
import com.bytedance.ies.powerpreload.b.i;
import com.google.c.h.a.q;
import com.google.c.h.a.v;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.comment.api.CommentApi;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import h.f.a.b;
import h.f.b.l;
import java.util.concurrent.Future;

public final class CommentPreload implements c<CommentApi.RealApi, Future<CommentItemList>> {
    static {
        Covode.recordClassIndex(44608);
    }

    @Override // com.bytedance.ies.powerpreload.b.d
    public final boolean enable(Bundle bundle) {
        if (bundle == null || bundle.getParcelable("comment_preload_request") == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.b.c
    public final boolean handleException(Exception exc) {
        l.d(exc, "");
        exc.printStackTrace();
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.b.c
    public final i getPreloadStrategy(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("comment_ttl")) {
            return new i(0, Api.f66569d, true, 1);
        }
        return new i(bundle.getInt("comment_ttl"), Api.f66569d, true);
    }

    /* Return type fixed from 'com.google.c.h.a.q<com.ss.android.ugc.aweme.comment.model.CommentItemList>' to match base method */
    @Override // com.bytedance.ies.powerpreload.b.c
    public final Future<CommentItemList> preload(Bundle bundle, b<? super Class<CommentApi.RealApi>, ? extends CommentApi.RealApi> bVar) {
        CommentPreloadRequest commentPreloadRequest;
        l.d(bVar, "");
        if (bundle == null || (commentPreloadRequest = (CommentPreloadRequest) bundle.getParcelable("comment_preload_request")) == null) {
            v vVar = new v();
            l.b(vVar, "");
            return vVar;
        }
        q<CommentItemList> preloadCommentList = ((CommentApi.RealApi) bVar.invoke(CommentApi.RealApi.class)).preloadCommentList(commentPreloadRequest.f72332a, commentPreloadRequest.f72333b, commentPreloadRequest.f72334c, commentPreloadRequest.f72335d, commentPreloadRequest.f72336e, commentPreloadRequest.f72337f, commentPreloadRequest.f72338g, commentPreloadRequest.f72339h, commentPreloadRequest.f72340i, commentPreloadRequest.f72341j);
        l.b(preloadCommentList, "");
        return preloadCommentList;
    }
}
