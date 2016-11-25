package news.beans;

import java.util.List;

/**
 * Created by baobiao on 2016/11/18.
 */

public class TiYuViewBean {

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * title : 火箭有望组哈汤联盟第一后场，NBA向来无忠诚可言
             * date : 2016-11-18 17:26
             * category : 体育
             * author_name : 小贱侃球
             * thumbnail_pic_s : http://09.imgmini.eastday.com/mobile/20161118/20161118_311beba3bd9a7153cd3f73fbc5906db4_mwpm_03200403.jpg
             * url : http://mini.eastday.com/mobile/161118172659973.html?qid=juheshuju
             * thumbnail_pic_s03 : http://09.imgmini.eastday.com/mobile/20161118/20161118_311beba3bd9a7153cd3f73fbc5906db4_mwpl_05500201.jpg
             */

            private String title;
            private String date;
            private String category;
            private String author_name;
            private String thumbnail_pic_s;
            private String url;
            private String thumbnail_pic_s03;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
