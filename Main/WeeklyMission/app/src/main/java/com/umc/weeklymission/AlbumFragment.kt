package com.umc.weeklymission

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.umc.weeklymission.databinding.FragmentAlbumBinding

class AlbumFragment : Fragment() {
    lateinit var binding: FragmentAlbumBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlbumBinding.inflate(layoutInflater)

        binding.musicListTitle1Tv.text = arguments?.getString("title")
        binding.musicListSinger1Tv.text = arguments?.getString("singer")
        binding.albumSingerTv.text = arguments?.getString("singer")

        binding.albumBackIv.setOnClickListener {
            (context as MainActivity)
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_frm, HomeFragment())
                .commitAllowingStateLoss()
        }

        binding.musicListTitle1Tv.setOnClickListener {
            Toast.makeText(activity, "제목1", Toast.LENGTH_SHORT).show()
        }

        binding.musicListTitle2Tv.setOnClickListener {
            Toast.makeText(activity, "제목2", Toast.LENGTH_SHORT).show()
        }

        binding.musicListTitle3Tv.setOnClickListener {
            Toast.makeText(activity, "제목3", Toast.LENGTH_SHORT).show()
        }

        binding.musicListTitle4Tv.setOnClickListener {
            Toast.makeText(activity, "제목4", Toast.LENGTH_SHORT).show()
        }

        binding.musicListTitle5Tv.setOnClickListener {
            Toast.makeText(activity, "제목5", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }
}