package com.inveitix.recyclerdemo;

import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fos on 16.1.2016 г..
 */
public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder> {

    private OnPostClickedListener listener;
    private List<Post> posts;

    public PostAdapter(List<Post> posts, OnPostClickedListener listener) {
        this.posts = posts;
        this.listener = listener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_post, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Post post = posts.get(position);
        holder.position = position;
        holder.txtTitle.setText(post.getTitle());
        holder.imgPost.setImageResource(post.getImageResource());

        for (ImageView star :
                holder.stars) {
            star.setImageResource(android.R.drawable.star_big_off);
        }

        for (int i = 0; i < post.getRating(); i++) {
            holder.stars[i].setImageResource(android.R.drawable.star_big_on);
        }
    }

    public void addPost(Post post) {
        posts.add(0, post);
        notifyItemInserted(0);
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView txtTitle;
        ImageView imgPost;
        ImageView[] stars;
        ImageView imgDelete;
        int position;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtTitle = (TextView) itemView.findViewById(R.id.txt_post_title);
            imgPost = (ImageView) itemView.findViewById(R.id.img_post);

            stars = new ImageView[] { (ImageView) itemView.findViewById(R.id.img_star_1),
             (ImageView) itemView.findViewById(R.id.img_star_2),
             (ImageView) itemView.findViewById(R.id.img_star_3),
             (ImageView) itemView.findViewById(R.id.img_star_4) };

            imgDelete = (ImageView) itemView.findViewById(R.id.img_delete);

            for (ImageView view :
                    stars) {
                view.setOnClickListener(this);
            }

            imgDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    posts.remove(position);
                    notifyItemRemoved(position);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            notifyDataSetChanged();
                        }
                    }, 500);
                }
            });
            imgPost.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onPostClicked(posts.get(position).getTitle());
                }
            });
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.img_star_1: {
                    posts.get(position).setRating(1);
                    break;
                }
                case R.id.img_star_2: {
                    posts.get(position).setRating(2);
                    break;
                }
                case R.id.img_star_3: {
                    posts.get(position).setRating(3);
                    break;
                }
                case R.id.img_star_4: {
                    posts.get(position).setRating(4);
                    break;
                }
            }
            notifyItemChanged(position);
        }
    }

    public interface OnPostClickedListener {
        void onPostClicked(String postTitle);
    }
}
