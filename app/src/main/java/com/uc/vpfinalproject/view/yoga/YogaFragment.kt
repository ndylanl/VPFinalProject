package com.uc.vpfinalproject.view.yoga

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.uc.vpfinalproject.viewmodel.Yoga.YogaViewModel
import com.uc.vpfinalproject.R
import com.uc.vpfinalproject.databinding.FragmentYogaBinding
import com.uc.vpfinalproject.view.NavBarActivity
import com.uc.vpfinalproject.view.note.CreateNoteActivity
import java.util.*
import kotlin.concurrent.schedule

class YogaFragment : Fragment() {

    private var _binding: FragmentYogaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentYogaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        Listener()

        return root
    }

    private fun Listener() {
        binding.beginnerCV.setOnClickListener(){
            if(binding.hiddenView.visibility == View.VISIBLE){
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.beginnerCV, AutoTransition())
                    TransitionManager.beginDelayedTransition(binding.interCV, AutoTransition().setDuration(800))
                    TransitionManager.beginDelayedTransition(binding.advancedCV, AutoTransition().setDuration(800))
                }
                binding.hiddenView.visibility = View.GONE
                binding.arrowButton.setImageResource(R.drawable.ic_baseline_expand_more_24)
            }else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.beginnerCV, AutoTransition())
                    TransitionManager.beginDelayedTransition(binding.interCV, AutoTransition())
                    TransitionManager.beginDelayedTransition(binding.advancedCV, AutoTransition())
                }
                binding.hiddenView.visibility = View.VISIBLE
                binding.arrowButton.setImageResource(R.drawable.ic_baseline_expand_less_24)
            }
        }

        binding.arrowButton.setOnClickListener(){
            if(binding.hiddenView.visibility == View.VISIBLE){
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.beginnerCV, AutoTransition())
                    TransitionManager.beginDelayedTransition(binding.interCV, AutoTransition().setDuration(800))
                    TransitionManager.beginDelayedTransition(binding.advancedCV, AutoTransition().setDuration(800))
                }
                binding.hiddenView.visibility = View.GONE
                binding.arrowButton.setImageResource(R.drawable.ic_baseline_expand_more_24)
            }else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.beginnerCV, AutoTransition())
                    TransitionManager.beginDelayedTransition(binding.interCV, AutoTransition())
                    TransitionManager.beginDelayedTransition(binding.advancedCV, AutoTransition())
                }
                binding.hiddenView.visibility = View.VISIBLE
                binding.arrowButton.setImageResource(R.drawable.ic_baseline_expand_less_24)
            }
        }

        binding.beginIV.setOnClickListener(){
            val myIntent = Intent(activity, OverviewActivity::class.java).apply {
                putExtra("lvl", "beginner")
            }
            requireActivity().startActivity(myIntent)
        }

        binding.interCV.setOnClickListener(){
            if(binding.hiddenView2.visibility == View.VISIBLE){
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.interCV, AutoTransition())
                    TransitionManager.beginDelayedTransition(binding.advancedCV, AutoTransition().setDuration(800))
                }
                binding.hiddenView2.visibility = View.GONE
                binding.arrowButton2.setImageResource(R.drawable.ic_baseline_expand_more_24)
            }else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.interCV, AutoTransition())
                    TransitionManager.beginDelayedTransition(binding.advancedCV, AutoTransition())
                }
                binding.hiddenView2.visibility = View.VISIBLE
                binding.arrowButton2.setImageResource(R.drawable.ic_baseline_expand_less_24)
            }
        }

        binding.arrowButton2.setOnClickListener(){
            if(binding.hiddenView2.visibility == View.VISIBLE){
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.interCV, AutoTransition())
                    TransitionManager.beginDelayedTransition(binding.advancedCV, AutoTransition().setDuration(800))
                }
                binding.hiddenView2.visibility = View.GONE
                binding.arrowButton2.setImageResource(R.drawable.ic_baseline_expand_more_24)
            }else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.interCV, AutoTransition())
                    TransitionManager.beginDelayedTransition(binding.advancedCV, AutoTransition())
                }
                binding.hiddenView2.visibility = View.VISIBLE
                binding.arrowButton2.setImageResource(R.drawable.ic_baseline_expand_less_24)
            }
        }

        binding.interIV.setOnClickListener(){
            val myIntent2 = Intent(activity, OverviewActivity::class.java).apply {
                putExtra("lvl", "intermediate")
            }
            requireActivity().startActivity(myIntent2)
        }

        binding.advancedCV.setOnClickListener(){
            if(binding.hiddenView3.visibility == View.VISIBLE){
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.advancedCV, AutoTransition())
                }
                binding.hiddenView3.visibility = View.GONE
                binding.arrowButton3.setImageResource(R.drawable.ic_baseline_expand_more_24)
            }else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.advancedCV, AutoTransition())
                }
                binding.hiddenView3.visibility = View.VISIBLE
                binding.arrowButton3.setImageResource(R.drawable.ic_baseline_expand_less_24)
            }
        }

        binding.arrowButton3.setOnClickListener(){
            if(binding.hiddenView3.visibility == View.VISIBLE){
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.advancedCV, AutoTransition())
                }
                binding.hiddenView3.visibility = View.GONE
                binding.arrowButton3.setImageResource(R.drawable.ic_baseline_expand_more_24)
            }else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(binding.advancedCV, AutoTransition())
                }
                binding.hiddenView3.visibility = View.VISIBLE
                binding.arrowButton3.setImageResource(R.drawable.ic_baseline_expand_less_24)
            }
        }

        binding.advanIV.setOnClickListener(){
            val myIntent3 = Intent(activity, OverviewActivity::class.java).apply {
                putExtra("lvl", "advanced")
            }
            requireActivity().startActivity(myIntent3)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

