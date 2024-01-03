#include <bits/stdc++.h>
using namespace std;

int main()
{
    int testCases;
    cin >> testCases;

    while (testCases--)
    {
        int size;
        cin >> size;

        vector<int> arr(size);
        map<int, vector<int>> freqMap;
        for (int i = 0; i < size; i++)
        {
            cin >> arr[i];
            freqMap[arr[i]].push_back(i);
        }

        int answer = size, last = size + 1;
        for (auto &[key, value] : freqMap)
        {
            int position = lower_bound(value.begin(), value.end(), last) - value.begin();
            if (position > 0)
            {
                position--;
                size -= position + 1;
                answer = min(answer, size + key);
                last = value[0];
            }
        }

        cout << answer << '\n';
    }

    return 0;
}
