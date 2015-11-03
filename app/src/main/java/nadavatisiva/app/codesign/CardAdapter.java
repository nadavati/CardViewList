package nadavatisiva.app.codesign;

    import android.content.Context;
    import android.content.Intent;
    import android.net.Uri;
    import android.support.v7.widget.RecyclerView;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.Button;
    import android.widget.ImageView;
    import android.widget.TextView;
    import java.util.ArrayList;
    import java.util.List;



public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    List<NatureItem> mItems;
    Button mapText;
    private Context context;
    private Context activity;

    public CardAdapter(Context context) {
        super();
        this.context = context;
        mItems = new ArrayList<NatureItem>();
        NatureItem nature = new NatureItem();
        nature.setName("Indira nagar");
        nature.setDes("3 BHK | Rs 20000/pm | Family");
        nature.setThumbnail(R.drawable.one);
        mItems.add(nature);
        nature = new NatureItem();
        nature.setName("Koramangala");
        nature.setDes("3 BHK | Rs 15000/pm | Family");
        nature.setThumbnail(R.drawable.two);
        nature.setShortlist(R.drawable.ic_none);
        nature.setStarNone(R.drawable.ic_none_star);
        mItems.add(nature);

        nature = new NatureItem();
        nature.setName("Malleswaram");
        nature.setDes("1 BHK | Rs 8500/pm | Bachelors");
        nature.setThumbnail(R.drawable.three);
        mItems.add(nature);

        nature = new NatureItem();
        nature.setName("Basavanagudi");
        nature.setDes("1 BHK | Rs 9000/pm | Family");
        nature.setThumbnail(R.drawable.four);
        mItems.add(nature);
        nature = new NatureItem();
        nature.setName("Whitefield");
        nature.setDes("2 BHK | Rs 12000/pm | Family");
        nature.setThumbnail(R.drawable.five);
        mItems.add(nature);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_card_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        NatureItem nature = mItems.get(i);
        viewHolder.tvNature.setText(nature.getName());
        viewHolder.tvDesNature.setText(nature.getDes());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
        viewHolder.imagShortList.setImageResource(nature.getShortlist());
        viewHolder.imgStarNone.setImageResource(nature.getStarNone());

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        Button mapText;
        public ImageView imgCall;
        public ImageView imagShortList;
        public ImageView imgThumbnail;
        public TextView tvNature;
        public TextView tvDesNature;
        public ImageView imgStarNone;
        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvNature = (TextView)itemView.findViewById(R.id.tv_nature);
            tvDesNature = (TextView)itemView.findViewById(R.id.tv_des_nature);
            imagShortList = (ImageView) itemView.findViewById(R.id.shortList);
             mapText = (Button) itemView.findViewById(R.id.testMap);
            imgStarNone = (ImageView) itemView.findViewById(R.id.rate3);
            imgCall = (ImageView) itemView.findViewById(R.id.call);
            mapText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,MapFragment.class);
                context.startActivity(intent);
            }
        });
            imagShortList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imagShortList.setBackgroundResource(R.drawable.ic_shortlist);
                }
            });
            imgStarNone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imgStarNone.setBackgroundResource(R.drawable.ic_star);
                }
            });
            imgCall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:08067915500"));
                    context.startActivity(callIntent);
                }
            });

            imgThumbnail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context,SingleActivity.class);
                    context.startActivity(intent);
                }
            });
        }
    }

}


