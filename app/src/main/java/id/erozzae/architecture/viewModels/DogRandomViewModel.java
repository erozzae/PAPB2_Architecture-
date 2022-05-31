package id.erozzae.architecture.viewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import id.erozzae.architecture.models.DogRandomResponse;
import id.erozzae.architecture.models.DogRepository;


public class DogRandomViewModel extends AndroidViewModel {
    private DogRepository dogRepository = new DogRepository();

    public LiveData<DogRandomResponse> getDogRandomResponseLiveData() {
        return dogRandomResponseLiveData;
    }

    private LiveData<DogRandomResponse>dogRandomResponseLiveData;
    public DogRandomViewModel(@NonNull Application application) {
        super(application);
        dogRandomResponseLiveData = dogRepository.getDogLiveData();
    }
    public void fetchDogData(){
        dogRandomResponseLiveData = dogRepository.getRandomDogData();
    }
}
