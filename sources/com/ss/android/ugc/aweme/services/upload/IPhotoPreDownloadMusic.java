package com.ss.android.ugc.aweme.services.upload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.g;

public interface IPhotoPreDownloadMusic {
    static {
        Covode.recordClassIndex(79840);
    }

    void firstMusicDownloadSuccess(MusicModel musicModel, String str);

    PhotoPreDownloadMusicData getPreDownloadMusicData();

    public static final class PhotoPreDownloadMusicData {
        private String musicFile;
        private MusicModel musicModel;

        static {
            Covode.recordClassIndex(79841);
        }

        public PhotoPreDownloadMusicData() {
            this(null, null, 3, null);
        }

        public final String getMusicFile() {
            return this.musicFile;
        }

        public final MusicModel getMusicModel() {
            return this.musicModel;
        }

        public final boolean isDataValid() {
            String str;
            if (this.musicModel == null || (str = this.musicFile) == null || !i.a(str)) {
                return false;
            }
            return true;
        }

        public final void setMusicFile(String str) {
            this.musicFile = str;
        }

        public final void setMusicModel(MusicModel musicModel2) {
            this.musicModel = musicModel2;
        }

        public PhotoPreDownloadMusicData(MusicModel musicModel2, String str) {
            this.musicModel = musicModel2;
            this.musicFile = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PhotoPreDownloadMusicData(MusicModel musicModel2, String str, int i2, g gVar) {
            this((i2 & 1) != 0 ? null : musicModel2, (i2 & 2) != 0 ? null : str);
        }
    }
}
